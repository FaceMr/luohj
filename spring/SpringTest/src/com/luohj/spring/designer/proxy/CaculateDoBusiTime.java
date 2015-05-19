package com.luohj.spring.designer.proxy;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 代理模式（Proxy）
 * 代理模式就是多一个代理类出来，替原对象进行一些操作，比如我们在租房子的时候回去找中介，
 * 为什么呢？因为你对该地区房屋的信息掌握的不够全面，希望找一个更熟悉的人去帮你做，此处的
 * 代理就是这个意思。
 * 
 * @author luohj
 * @note
 * 与装饰模式比较像（Proxy），但是实际上，在装饰器模式和代理模式之间还是有很多差别的。
 * 装饰器模式关注于在一个对象上动态的添加方法，然而代理模式关注于控制对对象的访问。换句话 说，
 * 用代理模式，代理类（proxy class）可以对它的客户隐藏一个对象的具体信息。因此，当使用
 * 代理模式的时候，我们常常在一个代理类中创建一个对象的实例。并且，当我们使用装饰器模 式的时
 * 候，我们通常的做法是将原始对象作为一个参数传给装饰者的构造器。 * 
 * 
 */
public class CaculateDoBusiTime implements BaseBusiness  {
	private Object clazz ;
	
	/**
	 * 构造函数--代理模式是封装了业务类，client并不了解具体业务是由什么类执行的
	 * 
	 * */
	public CaculateDoBusiTime(){
		super();
		this.clazz = new PrintBusiness();
		System.out.println("代理模式！");
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
