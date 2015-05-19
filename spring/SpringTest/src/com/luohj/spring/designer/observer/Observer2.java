package com.luohj.spring.designer.observer;

public class Observer2 extends NoticeFlag {
	public Observer2(){
		super();
	}
	
	@Override
	public void update() {
		if(!getFlag()){
			System.out.println("observer2 has received!" + getSeq());
			setFlag(true);
		}
	}

}
