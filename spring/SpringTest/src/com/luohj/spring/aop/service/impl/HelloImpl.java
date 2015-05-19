package com.luohj.spring.aop.service.impl;

import com.luohj.spring.aop.service.IHello;

public class HelloImpl implements IHello {

	@Override
	public void sayHello(String name) {
		System.out.println(name+" GoodBye!");
	}

	@Override
	public void sayBye(String name) {
		System.out.println(name+" Hello!");
	}

	@Override
	public void helloWorld() {
		System.out.println("Hello, World!");
	}

}
