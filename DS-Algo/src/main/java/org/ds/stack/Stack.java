package org.ds.stack;

/**
 * @author amos
 * @date Sep 16, 2016
 * @version V0.1
 */
public interface Stack<E> {
	int size();
	boolean empty();
	void push(E e);
	E pop();
	E top();
	boolean contain(E e);
}
