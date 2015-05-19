package com.luohj.spring.designer.visitor;

public interface Subject {
	public void accept(Visitor visitor);
	public String getSubject();
}
