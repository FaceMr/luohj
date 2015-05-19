package com.luohj.spring.test;

import org.junit.Test;

import com.luohj.spring.designer.state.Context;
import com.luohj.spring.designer.state.State;

public class StateTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		State state = new State();
		Context context = new Context(state);
		
		//设置第一种状态
		state.setValue("state1");
		context.method();
		
		//设置第二种状态
		state.setValue("state2");
		context.method();
	}
}
