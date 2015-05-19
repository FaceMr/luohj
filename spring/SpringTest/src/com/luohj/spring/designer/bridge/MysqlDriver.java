package com.luohj.spring.designer.bridge;

public class MysqlDriver implements Driver {

	@Override
	public void connect() {
		System.out.println("Mysql connect!");
	}

}
