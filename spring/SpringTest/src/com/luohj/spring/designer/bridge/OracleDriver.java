package com.luohj.spring.designer.bridge;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OracleDriver implements Driver  {

	@Override
	public void connect() {
		System.out.println("Oracle connect!");
	}

}
