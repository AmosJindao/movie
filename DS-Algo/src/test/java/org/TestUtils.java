package org;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author amos
 * @date 2018-01-19
 */
public class TestUtils{

    public static int[] getAnArray(int limit) {
        int[] arr = new int[limit];
        List<Integer> lst = new Random().ints(0, 100000).limit(limit).collect(() -> {
            return new LinkedList<>();
        }, (list, iint) -> {
            list.add(iint);
        }, (l1, l2) -> {
            l1.addAll(l2);
        });

       for(int i=0; i<lst.size(); i++){
           arr[i] = lst.get(i);
       }

       return arr;
    }
}
