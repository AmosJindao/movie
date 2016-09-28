package org.ds.link;

/**
 * @author amos
 * @date Sep 20, 2016
 * @version V0.1
 */
public class SingleNode<E> {
	private E e;
	private SingleNode<E> next;

	public SingleNode() {

	}

	public SingleNode(E e, SingleNode<E> next) {
		this.e = e;
		this.next = next;
	}

	public E getValue() {
		return e;
	}

	public void setValue(E e) {
		this.e = e;
	}

	public SingleNode<E> getNext() {
		return next;
	}

	public void setNext(SingleNode<E> next) {
		this.next = next;
	}
}
