package com.luohj.spring.designer.iterator;

/**
 * 聚集接口
 * 
 * @author luohj
 *
 */
public interface Collection {
	
	public Iterator iterator();
	
	/*取得集合元素*/
	public Object get(int i);
	
	/*取得集合大小*/
	public int size();
}