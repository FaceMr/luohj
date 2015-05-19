package com.luohj.spring.designer.memento;

/**
 * Memento类是备忘录类
 * 
 * @author luohj
 *
 */
public class Memento {
	
	private String value;

	public Memento(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
