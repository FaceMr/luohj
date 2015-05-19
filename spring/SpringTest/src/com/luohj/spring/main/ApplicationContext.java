package com.luohj.spring.main;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.ConvertUtils;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.XPath;
import org.dom4j.io.SAXReader;

import com.luohj.spring.vo.BeanInformation;
import com.luohj.spring.vo.PropertyInformation;

public class ApplicationContext {
	List<BeanInformation> beansInformation = new ArrayList<BeanInformation>();
	Map<String, Object> singleton = new HashMap<String, Object>();

	public ApplicationContext() {
	};

	public ApplicationContext(String filename) {
		readXml(filename);
		initBean();
		this.injectObject();
	}

	public void readXml(String filename) {
		SAXReader saxReader = new SAXReader();
		Document document = null;
		try {
			// 使用反射机制,通过文件名加载文件路径
			URL xmlPath = this.getClass().getClassLoader()
					.getResource(filename);

			// 通过文件路径获得这个文件的document对象
			document = saxReader.read(xmlPath);

			Map<String, String> nsMap = new HashMap<String, String>();
			nsMap.put("ns", "http://www.springframework.org/schema/beans");// 加入命名空间

			XPath xsub = document.createXPath("//ns:beans/ns:bean");// 创建beans/bean查询路径
			xsub.setNamespaceURIs(nsMap);// 设置命名空间

			// 获得所有路径下的节点
			List<Element> beans = xsub.selectNodes(document);// 获取文档下所有bean节点
			for (Element element : beans) {
				System.out.println(element.attributeValue("id"));
				System.out.println(element.attributeValue("class"));

				BeanInformation beanInformation = new BeanInformation();
				beanInformation.setId(element.attributeValue("id"));
				beanInformation.setName(element.attributeValue("class"));

				XPath xref = element.createXPath("ns:property");// 创建properties查询路径
				xref.setNamespaceURIs(nsMap);// 设置命名空间

				List<Element> propertys = xref.selectNodes(element);
				for (Element property : propertys) {
					PropertyInformation propertyInformation = new PropertyInformation();
					propertyInformation
							.setName(property.attributeValue("name"));
					propertyInformation.setRef(property.attributeValue("ref"));
					propertyInformation.setValue(property
							.attributeValue("value"));
					beanInformation.getPropertyInformation().add(
							propertyInformation);
				}
				beansInformation.add(beanInformation);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void initBean() {
		for (BeanInformation beanInformation : beansInformation) {
			if (beanInformation.getName() != null
					&& !"".equals(beanInformation.getName())) {
				// 通过反射机制，根据名字初始化这个类
				try {
					singleton.put(beanInformation.getId(),
							Class.forName(beanInformation.getName())
									.newInstance());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 关于注入的实现
	 */
	private void injectObject() {
		for (BeanInformation beanInformation : beansInformation) {
			Object bean = singleton.get(beanInformation.getId());
			if (bean != null) {
				try {
					PropertyDescriptor[] ps = Introspector.getBeanInfo(
							bean.getClass()).getPropertyDescriptors();
					for (PropertyInformation propertyInformation : beanInformation
							.getPropertyInformation()) {
						for (PropertyDescriptor properdesc : ps) {
							if (propertyInformation.getName().equals(
									properdesc.getName())) {
								Method setter = properdesc.getWriteMethod();// 获取属性的setter方法
																			// ,private
								if (setter != null) {
									Object value = null;
									if (propertyInformation.getRef() != null
											&& !"".equals(propertyInformation
													.getRef().trim())) {
										value = singleton
												.get(propertyInformation
														.getRef());
									} else {
										value = ConvertUtils.convert(
												propertyInformation.getValue(),
												properdesc.getPropertyType());
									}
									setter.setAccessible(true);
									setter.invoke(bean, value);// 把引用对象注入到属性
								}
								break;
							}
						}
					}
				} catch (Exception e) {
				}
			}
		}
	}

	public Object getBean(String id) {
		return this.singleton.get(id);
	}
}