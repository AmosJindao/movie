package org.algo.search;

/**
 * Jump Search is search algorithm for sorted arrays.
 * In Jump Search, it jumps fixed steps m after each match. Finally, it narrows the range down to (km,(k+1)m).
 * Then use linear search to get the final result.
 *
 * @author amos
 * @date 2018-01-19
 */
public class JumpSearch{

    /**
     * @param arr sorted array
     * @param m   step
     * @param x   the number to be searched
     * @return the index of element if found; otherwise, -1.
     */
    public static int jumpSearch(int[] arr, int m, int x) {
        int start = 0;
        int i = start;
        while (i < arr.length) {
            if (arr[i] == x) {
                return i;
            } else if (arr[i] < x) {
                start = i;
                i += m;
            } else {
                break;
            }
        }

        i = Math.min(i, arr.length);

        for(int j=start; j<i;j++){
            if (arr[j] == x) {
                return j;
            }
        }

        return -1;
    }
}
