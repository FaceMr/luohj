package com.luohj.spring.designer.command;

/**
 * 调用者-发出命令
 * 
 * @author luohj
 *
 */
public class Invoker {
	
	private Command command;
	
	public Invoker(Command command) {
		this.command = command;
	}

	public void action(){
		command.exe();
	}
}
