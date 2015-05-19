package com.luohj.spring.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LoggerProxy implements InvocationHandler {
	private Object delegate ;
	private String msg = "defualt message";
	private String level = "info" ;
	
	public LoggerProxy(String msg,String level){
		this.msg = msg;
		this.level = level;
	}
	
	public LoggerProxy(String msg){
		this.msg = msg;
	}
	
	public LoggerProxy(){
		
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = null;
		try {
			//执行原来的方法之前记录日志
			print();
			//JVM通过这条语句执行原来的方法(反射机制)
			result = method.invoke(this.delegate, args);

		} catch (Exception e) {
			e.printStackTrace();
		}
		//返回方法返回值给调用者
		return result;
	}
	
	public Object bind(Object delegate) {
		this.delegate = delegate;
		return Proxy.newProxyInstance(
				this.delegate.getClass().getClassLoader(), this.delegate
						.getClass().getInterfaces(), this);

	}
	
	public void print(){
		if(level.equals("info"))
			System.out.println("INFO:" + msg);
		else if(level.equals("error"))
			System.err.println("ERROR:" + msg);
		else if(level.equals("warn"))
			System.err.println("WARN:" + msg);
		else
			System.out.println("INFO:" + msg);			
	}
}
