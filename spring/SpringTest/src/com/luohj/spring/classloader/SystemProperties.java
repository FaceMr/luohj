package com.luohj.spring.classloader;

import java.util.Map;

public class SystemProperties {
	public void print() {
		for (Map.Entry<Object, Object> entry : System.getProperties()
				.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
	}
}
