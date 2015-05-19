package com.luohj.spring.test;

import org.junit.Test;

import com.luohj.spring.designer.chainResponsibility.MyHandler;

public class MyHandlerTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		
		//如果是环状调用一定要设置退出标志，不然会一直循环调用。
		MyHandler h1 = new MyHandler(1);  
		MyHandler h2 = new MyHandler(2);  
		MyHandler h3 = new MyHandler(3);  
		
		h1.setHandler(h2);  
		h2.setHandler(h3);  
		h3.setHandler(h1);
		h1.operator();  
	}

}
