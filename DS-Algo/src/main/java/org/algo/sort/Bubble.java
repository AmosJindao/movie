package org.algo.sort;

import org.algo.AlgoBaseUtils;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author amos
 * @date 2016-10-11
 */
public class Bubble{
    public static void bubble(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
