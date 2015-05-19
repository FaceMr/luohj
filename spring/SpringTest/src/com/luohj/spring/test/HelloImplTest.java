package com.luohj.spring.test;

import org.junit.Test;

import com.luohj.spring.aop.proxy.LoggerProxy;
import com.luohj.spring.aop.service.IHello;
import com.luohj.spring.aop.service.impl.HelloImpl;

public class HelloImplTest {
	static IHello hello = null;
	public HelloImplTest(){
		if(hello==null)
			getProxyHello();
	}
	@Test
	public void testSayHello() {
//		fail("Not yet implemented");
		hello.sayHello("Iris");
	}

	@Test
	public void testSayBye() {
//		fail("Not yet implemented");
		hello.sayBye("Crystal");
	}

	@Test
	public void testHelloWorld() {
//		fail("Not yet implemented");
		hello.helloWorld();
	}
	
	private void getProxyHello(){
		hello = (IHello)new LoggerProxy("TEWTWETKFASLDJASF").bind(new HelloImpl());
	}
}
