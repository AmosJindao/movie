package org.algo.search;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author amos
 * @date 2018-01-19
 */
public class LinearSearchTest{

    @Test
    public void linearSearch(){
        int[] arr = new int[]{1,6,3,8,2,5,9,0,12,56,32,71,68};

        Assert.assertEquals(LinearSearch.linearSearch(arr,9),6);
    }
}
