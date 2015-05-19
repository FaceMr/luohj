package com.luohj.spring.designer.iterator;

/**
 * 迭代子模式（Iterator）
 * 顾名思义，迭代器模式就是顺序访问聚集中的对象，一般来说，集合中非常常见，
 * 如果对集合类比较熟悉的话，理解本模式会十分轻松。这句话包含两层意思：
 * 一是需要遍历的对象，即聚集对象，二是迭代器对象，用于对聚集对象进行遍历访问。
 * 
 * @author luohj
 *
 */
public class MyCollection implements Collection {
	public Object object[] ;
	
	public MyCollection (String[] obj) {
		if(obj!=null){
			String [] a =  obj ;
			object = a;
		}else{
			String [] a =  {"A","B","C","D","E"};
			object = a;
		}
	}
	
	public MyCollection (Integer[] obj) {
		if(obj!=null){
			Integer [] a =  obj ;
			object = a;
		}else{
			Integer [] a =  {1,2,3,4,5};
			object = a;
		}
	}
	
	public MyCollection () {
		String [] a =  {"A","B","C","D","E"};
		object = a;
	}
	
	@Override
	public Iterator iterator() {
		return new MyIterator(this);
	}

	@Override
	public Object get(int i) {
		return object[i];
	}

	@Override
	public int size() {
		return object.length;
	}
}
