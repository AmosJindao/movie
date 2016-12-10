package org.algo.sort;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author amos
 * @date 2016-10-25
 */
public class SortTest{
    protected static void print(int[] arr) {
        for (int a : arr) {
            System.out.print(a + ",");
        }
        System.out.println();
    }

    public static final int[] getRandomInts(int num) {
        Random rd = new Random();
        IntStream ints = rd.ints(num, 0, 100);
        int[] arr = ints.toArray();
        return arr;
    }

    protected static final boolean isAsc(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]){
                return false;
            }
        }

        return true;
    }
}