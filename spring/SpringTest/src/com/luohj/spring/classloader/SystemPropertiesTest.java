package com.luohj.spring.classloader;

import org.junit.Test;

import com.luohj.spring.aop.service.IHello;
import com.luohj.spring.aop.service.impl.HelloImpl;

/**
 * 1、Bootstrap
 * Loader（启动类加载器）：加载System.getProperty("sun.boot.class.path")所指定的路径或jar。
 * 2、Extended
 * Loader（标准扩展类加载器ExtClassLoader）：加载System.getProperty("java.ext.dirs"
 * )所指定的路径或jar。在使用Java运行程序时，也可以指定其搜索路径，例如：java
 * -Djava.ext.dirs=d:\projects\testproj\classes HelloWorld * 
 * 3、AppClass
 * Loader（系统类加载器AppClassLoader）：加载System.getProperty("java.class.path"
 * )所指定的路径或jar。在使用Java运行程序时，也可以加上-cp来覆盖原有的Classpath设置，例如： java -cp
 * ./lavasoft/classes HelloWorld
 * 
 * ExtClassLoader和AppClassLoader在JVM启动后，会在JVM中保存一份，并且在程序运行中无法改变其搜索路径。
 * 如果想在运行时从其他搜索路径加载类，就要产生新的类加载器。
 * 
 * @author luohj
 * 
 * @see 
 * http://blog.csdn.net/love_Javc_you/article/details/38081683
 * http://shangjava.iteye.com/blog/1097096
 * 
 */
public class SystemPropertiesTest {

	@Test
	public void testPrint() throws ClassNotFoundException {
		// fail("Not yet implemented");
		//系统属性
//		new SystemProperties().print();
//		
//		//结果可以看出，并没有获取到ExtClassLoader的父Loader，
//		//原因是Bootstrap Loader（启动类加载器）是用C语言实现的，
//		//找不到一个确定的返回父Loader的方式，于是就返回null。
//		IHello hello = new HelloImpl(); 
//        Class c = hello.getClass(); 
//        ClassLoader loader = c.getClassLoader(); 
//        System.out.println(loader); 
//        System.out.println(loader.getParent()); 
//        System.out.println(loader.getParent().getParent()); 
        
        //类的加载
		//类加载有三种方式：
		//1、命令行启动应用时候由JVM初始化加载
		//2、通过Class.forName()方法动态加载
		//3、通过ClassLoader.loadClass()方法动态加载
        ClassLoader loader1 = SystemPropertiesTest.class.getClassLoader(); 
        System.out.println(loader1); 
        //使用ClassLoader.loadClass()来加载类，不会执行初始化块 
//        loader1.loadClass("com.luohj.spring.classloader.Test2"); 
        //使用Class.forName()来加载类，默认会执行初始化块 
        Class.forName("com.luohj.spring.classloader.Test2"); 
        //使用Class.forName()来加载类，并指定ClassLoader，初始化时不执行静态块 
//        Class.forName("com.luohj.spring.classloader.Test2", false, loader1); 

	}

}
