package org.ds.stack;

import org.ds.exception.StackEmptyException;

/**
 * @author amos
 * @date Sep 16, 2016
 * @version V0.1
 */
public class ArrayStack<E> implements Stack<E> {
	private int size;
	private Object[] elements;
	
	private static int DEFAULT_LENGTH = 6;
	private static final Object[] DEFAULT_EMPTY_ARR = {};

	public ArrayStack() {
		size=0;
		elements = DEFAULT_EMPTY_ARR;
	}

	public ArrayStack(int length) {
		elements = new Object[length];
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean empty() {
		return size == 0;
	}

	@Override
	public void push(E e) {
		if(e == null){
			throw new NullPointerException("parameter error");
		}
		if(elements == DEFAULT_EMPTY_ARR){
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
	public E pop() {
		if(empty()){
			throw new StackEmptyException("Stack is empty! ");
		}
		
		@SuppressWarnings("unchecked")
		E e = (E)elements[--size];
		
		elements[size] = null;
		return e;
	}

	@Override
	public E top() {
		if(empty()){
			throw new StackEmptyException("Stack is empty! ");
		}
		
		@SuppressWarnings("unchecked")
		E e = (E)elements[size-1];
		
		return e;
	}

	@Override
	public boolean contain(E e) {
		if(empty()){
			return false;
		}
		for(int i=0; i<size; i++){
			if(elements[i].equals(e)){
				return true;
			}
		}
		return false;
	}

}
