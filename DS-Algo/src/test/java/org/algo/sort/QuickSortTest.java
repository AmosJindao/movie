package org.algo.sort;

/**
 * @author amos
 * @date 2016-10-15
 */
public class QuickSortTest extends  SortParentTest{
    public static void main(String[] args) {
        int[] arr = getRandomInts(10);

        print(arr);
        QuickSort.quickSort(arr, 0, arr.length-1);
        print(arr);
    }
}
