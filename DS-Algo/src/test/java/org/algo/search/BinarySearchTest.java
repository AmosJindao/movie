package org.algo.search;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author amos
 * @date 2018-01-19
 */
public class BinarySearchTest{

    @Test
    public void binarySearchRecurring(){
        int[] arr = new int[]{1,2,3,5,6,7,8,9,10,11,12,23,56,67,89,99};

        Assert.assertEquals(BinarySearch.binarySearchRecurring(arr,0, arr.length, 9),7);
    }

    @Test
    public void binarySearchWhile(){
        int[] arr = new int[]{1,2,3,5,6,7,8,9,10,11,12,23,56,67,89,99};

        Assert.assertEquals(BinarySearch.binarySearchWhile(arr, 9),7);
    }
}
