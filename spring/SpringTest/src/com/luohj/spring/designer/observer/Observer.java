package com.luohj.spring.designer.observer;

/**
 * 观察者模式（Observer）
 * 包括这个模式在内的接下来的四个模式，都是类和类之间的关系，不涉及到继承，
 * 学的时候应该 记得归纳，记得本文最开始的那个图。观察者模式很好理解，类似
 * 于邮件订阅和RSS订阅，当我们浏览一些博客或wiki时，经常会看到RSS图标，
 * 就这的意思是，当你订阅了该文章，如果后续有更新，会及时通知你。其实，简单
 * 来讲就一句话：当一个对象变化时，其它依赖该对象的对象都会收到通知，并且随
 * 着变化！对象之间是一种一对多的关系。

 * @author luohj
 *
 */
public interface Observer {
	public void update();  
}
