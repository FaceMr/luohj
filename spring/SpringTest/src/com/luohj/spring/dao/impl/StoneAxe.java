package com.luohj.spring.dao.impl;

import com.luohj.spring.dao.Axe;

public class StoneAxe  implements Axe {
	
	@Override
	public void chop() {
	   System.out.println("铁斧头砍柴真慢");
	}
}
