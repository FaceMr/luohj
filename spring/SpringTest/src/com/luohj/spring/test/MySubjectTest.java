package com.luohj.spring.test;

import org.junit.Test;

import com.luohj.spring.designer.observer.MySubject;
import com.luohj.spring.designer.observer.Observer1;
import com.luohj.spring.designer.observer.Observer2;
import com.luohj.spring.designer.observer.Subject;

public class MySubjectTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Subject sub = new MySubject();  
		sub.add(new Observer1());  
		sub.add(new Observer2());  
		sub.operation();  
		sub.add(new Observer2());  
		sub.operation();  
	}

}
