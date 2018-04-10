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

        arr = getRandomInts(10);
        Insert.insertSwapALot(arr);
        Assert.assertTrue(isAsc(arr));


        arr = getRandomInts(10);
        Insert.librarySort(arr);
        Assert.assertTrue(isAsc(arr));
    }


}
