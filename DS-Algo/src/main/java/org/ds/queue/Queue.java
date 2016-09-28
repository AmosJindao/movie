package org.ds.queue;

import org.ds.exception.QueueEmptyException;

/**
 * @author amos
 * @date Sep 18, 2016
 * @version V0.1
 * @param <E>
 */
public interface Queue<E> {
	int size();
	boolean empty();
	E front() throws QueueEmptyException;
	
	void enqueue(E e) throws QueueEmptyException;
	
	E dequeue() throws QueueEmptyException;
	
	void traversal();
}