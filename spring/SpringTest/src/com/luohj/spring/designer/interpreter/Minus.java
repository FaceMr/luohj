package com.luohj.spring.designer.interpreter;

/**
 * 解释器具体实现类
 * 
 * @author luohj
 *
 */
public class Minus implements Expression {

	@Override
	public int interpret(Context context) {
		return context.getNum1()-context.getNum2();
	}
}