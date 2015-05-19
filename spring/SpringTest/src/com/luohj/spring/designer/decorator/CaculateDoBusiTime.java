package com.luohj.spring.designer.decorator;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 装饰模式（Decorator）
 * 顾名思义，装饰模式就是给一个对象增加一些新的功能，而且是动态的，要求装饰对象和被装饰对象实现同一个接口，装饰对象持有被装饰对象的实例
 * 本例中：装饰类CaculateDoBusiTime ，被装饰类：PrintBusiness。
 * @author luohj
 *
 * @note
 * 与代理模式比较像（Proxy），但是实际上，在装饰器模式和代理模式之间还是有很多差别的。
 * 装饰器模式关注于在一个对象上动态的添加方法，然而代理模式关注于控制对对象的访问。换句话 说，
 * 用代理模式，代理类（proxy class）可以对它的客户隐藏一个对象的具体信息。因此，当使用
 * 代理模式的时候，我们常常在一个代理类中创建一个对象的实例。并且，当我们使用装饰器模 式的时
 * 候，我们通常的做法是将原始对象作为一个参数传给装饰者的构造器。 * 
 * 
 */
public class CaculateDoBusiTime implements BaseBusiness  {
	private Object clazz ;
	
	/**
	 * 构造函数--装饰模式是将业务本身的实例已经生成，只是在这个业务的前后动态加一些方法
	 * @param clazz 
	 * 
	 * */
	public CaculateDoBusiTime(Object clazz){
		super();
		this.clazz = clazz ;
		System.out.println("装饰模式！");
	}
	
	@Override
	public void doBusiness() {
		// TODO Auto-generated method stub
		long start = printDate("Start time");
		((BaseBusiness)clazz).doBusiness();
		long end = printDate("End time");
		System.out.println("时间差："+(end-start)+"ms");
	}
	
	private long printDate(String str){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now = new Date();
		System.out.println(str+":" + format.format(now));
		return now.getTime();
	}

}
