package com.luohj.spring.dao.impl;

import com.luohj.spring.dao.Axe;
import com.luohj.spring.dao.PersonDao;

public class Chinese implements PersonDao {
	private Axe axe;
	
	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("保存人的方法");
	}

	@Override
	public void useAxe() {
		// TODO Auto-generated method stub
		axe.chop();
	}

	public Axe getAxe() {
		return axe;
	}

	public void setAxe(Axe axe) {
		this.axe = axe;
	}

}
