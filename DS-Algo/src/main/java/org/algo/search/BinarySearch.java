package org.algo.search;

/**
 * searh an integer x in an sorted array by dividing the array in half.
 * if x matches any of the array's elements,
 * then return the index of the matched element;
 * else
 * return -1;
 *
 * @author amos
 * @date 2018-01-19
 */
public class BinarySearch{

    /**
     * @param arr   sorted array
     * @param left
     * @param right
     * @param x
     * @return
     */
    public static int binarySearchRecurring(int[] arr, int left, int right, int x) {
        if (right < left) {
            return -1;
        }
        int mid = (right + left) >> 1;
        if (arr[mid] == x) {
            return mid;
        }
        if (arr[mid] < x) {
            return binarySearchRecurring(arr, mid + 1, right, x);
        } else {
            return binarySearchRecurring(arr, left, mid, x);
        }

    }

    public static int binarySearchWhile(int[] arr, int x) {
        int right = arr.length;
        int left = 0;
        while (right >= left) {
            int mid = (right + left) >> 1;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return -1;

    }
}
