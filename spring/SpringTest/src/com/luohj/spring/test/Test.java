package com.luohj.spring.test;

import com.luohj.spring.dao.PersonDao;
import com.luohj.spring.main.ApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ApplicationContext("applicationContext.xml");
		PersonDao person = (PersonDao)ac.getBean("chinese");
		person.save();
		person.useAxe();
	}
}
