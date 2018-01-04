package org.algo.sort;

import org.algo.AlgoBaseUtils;

/**
 * Insert sorting is a simple sorting algorithm that builds a final sorted array (or list)
 * one item at a time. It works poorly on large data set.
 * But it still has multiple advantages:
 * <ul>
 *     <li>simple to implement.</li>
 *     <li>efficient on small data sets.</li>
 *     <li>stable</li>
 *     <li>adaptive</li>
 *     <li>online</li>
 *     <li>in-place</li>
 * </ul>
 *
 * In JDK8, the pair insertion is implemented!
 */
public class Insert{
    public static void insert(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];

            int j = i - 1;
            for (; j >= 0; j--) {
                if (tmp < arr[j]) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }

            arr[j + 1] = tmp;
        }
    }

    public static void insertSwapALot(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (arr[j + 1] < arr[j]) {
                    AlgoBaseUtils.swap(arr,j+1, j);
                } else {
                    break;
                }
            }
        }
    }
}
