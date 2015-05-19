package com.luohj.spring.designer.interpreter;

/**
 * 解释器模式（Interpreter）
 * Interpreter是一种特殊的设计模式，它建立一个解释器，对于特定的计算机程序设计语言，
 * 用来解释预先定义的文法。简单地说，Interpreter模式是一种简单的语法解释器构架。
 * 
 * @class 解释器接口
 * @author luohj
 *
 */
public interface Expression {
	 public int interpret(Context context);  
}
