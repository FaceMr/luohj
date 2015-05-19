package com.luohj.spring.test;

import org.junit.Test;

import com.luohj.spring.designer.bridge.Driver;
import com.luohj.spring.designer.bridge.DriverManagerEx;
import com.luohj.spring.designer.bridge.MysqlDriver;
import com.luohj.spring.designer.bridge.OracleDriver;

public class DriverManagerExTest {

	@Test
	public void testConnect() {
		//fail("Not yet implemented");
		Driver dvOracle = new OracleDriver();
		DriverManagerEx dvMgr1 = new DriverManagerEx();
		dvMgr1.setDriver(dvOracle);
		dvMgr1.connect();
		
		Driver dvMysql = new MysqlDriver();
		DriverManagerEx dvMgr2 = new DriverManagerEx();
		dvMgr2.setDriver(dvMysql);
		dvMgr2.connect();
	}

}
