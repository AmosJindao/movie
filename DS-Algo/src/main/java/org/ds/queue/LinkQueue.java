package org.ds.queue;

import org.ds.exception.QueueEmptyException;
import org.ds.link.SingleNode;

/**
 * @author amos
 * @date Sep 20, 2016
 * @version V0.1
 * @param <E>
 */
public class LinkQueue<E> implements Queue<E> {
	
	private int size;
	
	private SingleNode<E> head;
	private SingleNode<E> tail;
	
	public LinkQueue(){
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean empty() {
		return size==0;
	}

	@Override
	public E front() throws QueueEmptyException {
		if(head == null){
			throw new QueueEmptyException("queue is empty!");
		}
		return head.getValue();
	}

	@Override
	public void enqueue(E e) throws QueueEmptyException {
		if(e == null){
			throw new NullPointerException("parameter error");
		}
		if(head == null){
			head = new SingleNode<>(e,null);
			tail = head;
		}else{ 
			SingleNode<E> tmpNode = new SingleNode<>(e,null);
			
			tail.setNext(tmpNode);
			
			tail = tmpNode;
		}
		
		size++;
	}

	@Override
	public E dequeue() throws QueueEmptyException {
		if(head == null){
			throw new QueueEmptyException("queue is empty!");
		}
		E e = head.getValue();
		
		SingleNode<E> newHead = head.getNext();
		
		head.setNext(null);
		head = newHead;
		
		size--;
		
		return e;
	}

	@Override
	public void traversal() {
		SingleNode<E> cur = head;
		while(cur != null){
			System.out.println(cur);
			
			cur = cur.getNext();
		}
	}

}
