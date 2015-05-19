package com.luohj.spring.designer.interpreter;

/**
 * 解释器上下文环境类。用来存储解释器的上下文环境，比如需要解释的文法等。
 * 
 * @author luohj
 *
 */
public class Context {
	
	private int num1;
	private int num2;
	
	public Context(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
}