package com.luohj.spring.test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.luohj.spring.designer.interpreter.Context;
import com.luohj.spring.designer.interpreter.Minus;
import com.luohj.spring.designer.interpreter.Plus;

public class ExpressionTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		// 计算9+2-8的值
		int result = new Minus().interpret((new Context(new Plus()
				.interpret(new Context(9, 2)), 8)));
		System.out.println(result);
		
		List<String> a = new ArrayList();
		Collections.checkedList(a, String.class);
	}
			
}
