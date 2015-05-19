package com.luohj.spring.test;

import org.junit.Test;

import com.luohj.spring.designer.strategy.ICalculator;
import com.luohj.spring.designer.strategy.Multiply;
import com.luohj.spring.designer.strategy.Plus;

public class CaculateTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		String exp = "2+8";  
		ICalculator cal = new Plus();  
		int result = cal.calculate(exp);  		
		System.out.println(result);  
		cal = new Multiply();
		exp = "2*8";  
		result = cal.calculate(exp);	
		System.out.println(result);  
	}

}
