package org.movie.commons.utils;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author amos
 * @date Aug 27, 2016
 * @version V0.1
 */
public class SkipListTest {
	public static final void main(String[] args){
		SkipList<Integer> skipList = new SkipList<>();
		
		
//		IntStream ints = new Random().ints();
//		
//		ints.limit(10).forEach(value->{
//			skipList.add(value);
//		});
		
		for(int i=0; i<15; i++){
			skipList.add(i);
		}
		
		skipList.print();
		System.out.println("----------------------------------------");
		
		skipList.remove(new Integer(2));
		skipList.print();
		System.out.println("----------------------------------------");
		
		skipList.remove(new Integer(5));
		skipList.print();
		System.out.println("----------------------------------------");
		
		skipList.remove(new Integer(7));
		skipList.print();
		System.out.println("----------------------------------------");
		
		System.out.println(skipList.get(5));
		
		skipList.remove(new Integer(9));
		skipList.print();
		System.out.println("----------------------------------------");
		
		skipList.clear();
		skipList.print();
		System.out.println("----------------------------------------");
	}
}
