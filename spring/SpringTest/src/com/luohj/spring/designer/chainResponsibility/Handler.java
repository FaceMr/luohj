package com.luohj.spring.designer.chainResponsibility;

/**
 * MyHandle类是核心，实例化后生成一系列相互持有的对象，构成一条链
 * 
 * @author luohj
 *
 */
public interface Handler {
	public void operator();  
}
