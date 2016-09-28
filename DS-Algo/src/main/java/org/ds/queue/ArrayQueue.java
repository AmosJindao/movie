package org.ds.queue;

import org.ds.exception.QueueEmptyException;

/**
 * @author amos
 * @date Sep 18, 2016
 * @version V0.1
 */
public class ArrayQueue<E> implements Queue<E> {
	
	private int size;
	
	private Object[] elements;
	
	private static final int DEFAULT_LENGTH = 6;
	private static final Object[] EMPTY_ARR = {};
	
	public ArrayQueue(){
		elements = EMPTY_ARR;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean empty() {
		return size==0;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E front() throws QueueEmptyException {
		if(elements == EMPTY_ARR){
			throw new QueueEmptyException("queue is empty!");
		}
		return (E)elements[0];
	}

	@Override
	public void enqueue(E e) throws QueueEmptyException {
		if(e == null){
			throw new NullPointerException("parameter error");
		}
		if(elements == EMPTY_ARR){
				elements = new Object[DEFAULT_LENGTH];
		}else{
			int len = elements.length;
			if(size > len){
				Object[] newElements = new Object[len + len >> 2];
				System.arraycopy(elements, 0, newElements, 0, len);
				
				elements = newElements;
			}
		}
		
		elements[size++] = e;
	}

	@Override
	public E dequeue() throws QueueEmptyException {
		if(elements == EMPTY_ARR){
			throw new QueueEmptyException("queue is empty!");
		}
		@SuppressWarnings("unchecked")
		E e = (E)elements[0];
		
		elements[0] = null;
		
		for(int i=1; i<size;i++){
			elements[i-1] = elements[i];
		}
		
		size--;
		
		return e;
	}

	@Override
	public void traversal() {
		for(int i=0; i<size;i++){
			System.out.print(elements[i]);
		}
	}

}
