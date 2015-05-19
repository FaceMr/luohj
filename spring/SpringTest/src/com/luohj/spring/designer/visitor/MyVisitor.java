package com.luohj.spring.designer.visitor;

/**
 * 访问者模式（Visitor）
 * 访问者模式把数据结构和作用于结构上的操作解耦合，使得操作集合可相对自由地演化。
 * 访问者模式适用于数据结构相对稳定算法又易变化的系统。因为访问者模式使得算法操作
 * 增加变得容易。若系统数据结构对象易于变化，经常有新的数据对象增加进来，则不适合
 * 使用访问者模式。访问者模式的优点是增加操作很容易，因为增加操作意味着增加新的访
 * 问者。访问者模式将有关行为集中到一个访问者对象中，其改变不影响系统数据结构。
 * 其缺点就是增加新的数据结构很困难
 * 
 * @class 一个Visitor类，存放要访问的对象
 * 
 * @author luohj
 *
 */
public class MyVisitor implements Visitor {

	@Override
	public void visit(Subject sub) {
		System.out.println("visit the subject："+sub.getSubject());
	}
}
