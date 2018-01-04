package org.algo.sort;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author amos
 * @date 2017-12-30
 */
public class InsertTest extends SortTest{

    @Test
    public void sort(){
        int[] arr = getRandomInts(10);
        Insert.insert(arr);
        Assert.assertTrue(isAsc(arr));

        int[] arr2 = getRandomInts(10);
        Insert.insertSwapALot(arr2);
        Assert.assertTrue(isAsc(arr2));
    }
}
