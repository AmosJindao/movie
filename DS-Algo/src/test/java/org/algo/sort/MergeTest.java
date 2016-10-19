package org.algo.sort;
import java.util.Random;
import java.util.stream.IntStream;

/**
 *
 */
public class MergeTest extends SortParentTest {

	public static void main(String[] args) {
        Random rd = new Random();
		IntStream ints = rd.ints(10, 0, 100);

		int[] arr = ints.toArray();

		print(arr);
		Merge.mergeSort(arr, 0, arr.length-1);
		print(arr);
	}
}