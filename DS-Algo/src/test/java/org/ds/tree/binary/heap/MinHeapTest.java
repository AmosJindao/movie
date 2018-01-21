package org.ds.tree.binary.heap;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author amos
 * @date 2018-01-20
 */
public class MinHeapTest{
    @Test
    public void add() {
        MinHeap heap = new MinHeap(20);
        heap.add(1);
        heap.add(3);
        heap.add(2);
        heap.add(1);
        heap.add(5);

        Assert.assertEquals(heap.size(), 5);
    }

    @Test
    public void delete() {
        MinHeap heap = new MinHeap(80);
        heap.add(1);
        heap.add(3);
        heap.add(2);
        heap.add(1);
        heap.add(5);

        heap.delete(3);
        heap.print();
        heap.delete(2);
        heap.print();

        Assert.assertEquals(heap.size(), 3);
    }
}
