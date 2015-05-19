package com.luohj.spring.classloader;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @author luohj
 * 
 */
public class MyClassLoader {
	public static void main(String[] args) throws MalformedURLException,
			ClassNotFoundException, IllegalAccessException,
			InstantiationException {
		URL url = new URL(
				"file:/D:\\work\\MyEclipse Work\\luohj\\spring\\SpringTest\\WebRoot\\WEB-INF\\classes");
		ClassLoader myloader = new URLClassLoader(new URL[] { url });
		Class c = myloader.loadClass("com.luohj.spring.classloader.Test2");
		System.out.println("----------");
		Test2 t2 = (Test2) c.newInstance();
	}
}