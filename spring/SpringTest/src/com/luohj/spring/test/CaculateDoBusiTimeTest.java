package com.luohj.spring.test;

import org.junit.Test;

import com.luohj.spring.designer.decorator.CaculateDoBusiTime;
import com.luohj.spring.designer.decorator.PrintBusiness;

public class CaculateDoBusiTimeTest {

	@Test
	public void testDoBusiness() {
		//装饰模式测试
		PrintBusiness prDecorator = new PrintBusiness();
		CaculateDoBusiTime testDecorator = new CaculateDoBusiTime(prDecorator);
		testDecorator.doBusiness();
		
		//代理模式测试
		com.luohj.spring.designer.proxy.CaculateDoBusiTime testProxy 
				= new com.luohj.spring.designer.proxy.CaculateDoBusiTime();
		testProxy.doBusiness();
	}

}
