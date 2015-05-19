package com.luohj.spring.designer.observer;

public class Observer1 extends NoticeFlag {
	public Observer1(){
		super();
	}
	@Override
	public void update() {
		if(!getFlag()){
			System.out.println("observer1 has received!" + getSeq());
			setFlag(true);
		}
	}
}
