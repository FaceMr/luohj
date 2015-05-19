package com.luohj.spring.test;

import org.junit.Test;

import com.luohj.spring.designer.iterator.Collection;
import com.luohj.spring.designer.iterator.Iterator;
import com.luohj.spring.designer.iterator.MyCollection;

/**
 * 聚集对象
 * 
 * @author luohj
 *
 */
public class MyCollectionTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Collection collection = new MyCollection(); 
		Iterator it = collection.iterator();  
		while(it.hasNext()){  
			System.out.println(it.next());  
		}
		
		Integer test[] = {1,4,6,7,11,123};
		Collection collection1 = new MyCollection(test); 
		Iterator it1 = collection1.iterator();  
		while(it1.hasNext()){  
			System.out.println(it1.next());  
		}
		
		String test1[] = {"C","D","W","X","A","S","B","F"};
		Collection collection2 = new MyCollection(test1); 
		Iterator it2 = collection2.iterator();  
		while(it2.hasNext()){  
			System.out.println(it2.next());  
		}

		Integer test2[] = null;
		Collection collection3 = new MyCollection(test2); 
		Iterator it3 = collection3.iterator();  
		while(it3.hasNext()){  
			System.out.println(it3.next());  
		}
		
	}

}
