package com.luohj.spring.designer.proxy;

public class PrintBusiness implements BaseBusiness {

	@Override
	public void doBusiness() {
		System.out.println("打印业务！");
	}

}