package com.luohj.spring.designer.command;

/**
 * 命令对象
 * 
 * @author luohj
 *
 */
public class MyCommand implements Command {

	private Receiver receiver;
	
	public MyCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void exe() {
		receiver.action();
	}
}
