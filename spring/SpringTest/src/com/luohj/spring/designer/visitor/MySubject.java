package com.luohj.spring.designer.visitor;

/**
 * Subject类，accept方法，接受将要访问它的对象，getSubject()获取将要被访问的属性
 * 
 * @author luohj
 *
 */
public class MySubject implements Subject {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String getSubject() {
		return "love";
	}
}
