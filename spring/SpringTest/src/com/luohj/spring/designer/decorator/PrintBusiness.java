package com.luohj.spring.designer.decorator;

public class PrintBusiness implements BaseBusiness {

	@Override
	public void doBusiness() {
		System.out.println("打印业务！");
	}

}
