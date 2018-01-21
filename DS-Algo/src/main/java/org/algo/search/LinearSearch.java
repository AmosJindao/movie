package org.algo.search;

/**
 * run through an array arr[], and one by one compare x with each element of the array arr[].
 * Set i is the array's index,
 * if arr[i] == x
 *  then return i;
 *
 * if x doesn't match any element of the array,
 *  then return -1;
 * @author amos
 * @date 2018-01-19
 */
public class LinearSearch{

    public static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
