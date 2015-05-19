package com.luohj.spring.designer.iterator;

/**
 * 迭代器接口
 * 
 * @author luohj
 *
 */
public interface Iterator {
	//前移
	public Object previous();
	
	//后移
	public Object next();
	public boolean hasNext();
	
	//取得第一个元素
	public Object first();
}
