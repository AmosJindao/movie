package org.algo.sort;

/**
 * @author amos
 * @date 2016-10-11
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
}
