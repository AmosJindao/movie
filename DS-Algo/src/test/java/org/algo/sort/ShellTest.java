package org.algo.sort;

import java.util.Random;
import java.util.stream.IntStream;

public class ShellTest extends SortParentTest {
    public static void main(String[] args) {
		Random rd = new Random();
		IntStream ints = rd.ints(10, 0, 100);

		int[] arr = ints.toArray();

		print(arr);
//		Shell.shellSort(arr);
		Shell.shellSort2(arr);
		print(arr);
	}
}
