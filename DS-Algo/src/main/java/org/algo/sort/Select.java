package org.algo.sort;

/**
 * @author amos
 * @date 2016-10-11
 */
public class Select{
    public static void select(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int tmp = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[tmp] > arr[j]) {
                    tmp = j;
                }
            }

            if (tmp != i) {
                int tmpi = arr[tmp];
                arr[tmp] = arr[i];
                arr[i] = tmpi;
            }
        }
    }
}
