package org.algo.sort;

import org.algo.AlgoBaseUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author amos
 * @date 2018-01-01
 */
public class BubbleTest extends SortTest{

    @Test
    public void sort(){
        int[] arr = getRandomInts(10);

        Bubble.bubble(arr);
        Assert.assertTrue(isAsc(arr));
    }
}
