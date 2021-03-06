package com.luohj.spring.designer.observer;

import java.util.Date;

public abstract class NoticeFlag implements Observer {
	public NoticeFlag(){
		long seqNo = new Date().getTime();
		System.out.println("初始化序列："+seqNo);
		setSeq(seqNo);
	}
	private boolean flag = false ;
	private long seq = 0l;

	public long getSeq() {
		return seq;
	}
	public void setSeq(long seq) {
		this.seq = seq;
	}
	public boolean getFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
}
