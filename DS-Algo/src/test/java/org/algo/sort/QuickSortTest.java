package org.algo.sort;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author amos
 * @date 2016-10-15
 */
public class QuickSortTest extends SortTest{

    @Test
    public void quickSort() {
        int[] arrLens = getRandomInts(10);

        for (int len: arrLens) {
            int[] arr = getRandomInts(len);
//            QuickSort.quickSort(arr, 0, arr.length - 1);
            QuickSort.dualPivotQuickSort(arr, 0, arr.length - 1);

            Assert.assertTrue(isAsc(arr));
        }
    }

//    @Test
//    public void dualPivotQuickSort(){
//        int[] arr = getRandomInts(10);
//        QuickSort.dualPivotQuickSort(arr, 0, arr.length - 1);
//
//        Assert.assertTrue(isAsc(arr));
//    }

}
