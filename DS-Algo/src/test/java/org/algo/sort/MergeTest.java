package org.algo.sort;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 */
public class MergeTest extends SortTest{

    @Test
    public void merge() {
        int[] arr = getRandomInts(10);
        Merge.mergeSort(arr, 0, arr.length - 1);
        Assert.assertTrue(isAsc(arr));

        arr = getRandomInts(13);
        Merge.mergeSort(arr, 0, arr.length - 1);
        Assert.assertTrue(isAsc(arr));

        arr = getRandomInts(10);
        Merge.mergeSortTopDown(arr);
        Assert.assertTrue(isAsc(arr));

        arr = getRandomInts(13);
        Merge.mergeSortTopDown(arr);
        Assert.assertTrue(isAsc(arr));


        arr = getRandomInts(10);
        Merge.mergeSortBottomUp(arr);
        Assert.assertTrue(isAsc(arr));

        arr = getRandomInts(13);
        Merge.mergeSortBottomUp(arr);
        Assert.assertTrue(isAsc(arr));

    }
}