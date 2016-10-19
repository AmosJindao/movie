package org.algo.sort;

import java.util.Random;
import java.util.stream.IntStream;

public class SortParentTest {
    protected static void print(int[] arr) {
		for (int a : arr) {
			System.out.print(a + ",");
		}
		System.out.println();
	}

	public static final int[] getRandomInts(int num){
		Random rd = new Random();
		IntStream ints = rd.ints(num, 0, 100);

		int[] arr = ints.toArray();

		return arr;
	}
}