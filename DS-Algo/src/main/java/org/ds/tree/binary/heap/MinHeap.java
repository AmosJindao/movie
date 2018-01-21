package org.ds.tree.binary.heap;

/**
 * @author amos
 * @date 2018-01-20
 */
public class MinHeap{
    private int[] heap;
    private int capacity;
    private int size;

    public MinHeap(int capacity) {
        heap = new int[capacity];
        this.capacity = capacity;
        size = 0;
    }

    public int getMin() {
        if (size > 0) {
            return heap[0];
        }
        return Integer.MIN_VALUE;
    }

    public void add(int num) {
        if (size >= capacity) {
            throw new IllegalStateException("overflow!");
        }

        heap[size] = num;
        int i = size;
        size++;
        while (i > 0 && heap[parent(i)] > heap[i]) {
            swap(heap, parent(i), i);
            i = parent(i);
        }
    }

    private void swap(int[] heap, int parent, int i) {
        //        int tmp = heap[parent];
        //        heap[parent] = heap[i];
        //        heap[i]=tmp;

        heap[parent] = heap[parent] ^ heap[i];
        heap[i] = heap[parent] ^ heap[i];
        heap[parent] = heap[parent] ^ heap[i];
    }

    public int parent(int i) {
        return (i - 1) / 2;
    }

    public int leftChild(int i) {
        return 2 * i + 1;
    }

    public int rightChild(int i) {
        return 2 * i + 2;
    }

    public int extractMin() {
        if (size <= 0) {
            throw new IllegalStateException("no elements in heap.");
        }

        if (size == 1) {
            size--;
            return heap[0];
        }

        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        minHeapify(0);
        return min;
    }

    private void minHeapify(int i) {
        int l = leftChild(i);
        int r = rightChild(i);
        int smallest = i;
        if (l < size && heap[l] < heap[i])
            smallest = l;
        if (r < size && heap[r] < heap[smallest])
            smallest = r;
        if (smallest != i) {
            swap(heap, i, smallest);
            minHeapify(smallest);
        }
    }

    /**
     * delete the element of a specific index
     *
     * @param idx the index of element to delete
     * @return the deleted elements
     */
    public int delete(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IllegalArgumentException("the index " + idx + " is illegal.");
        }

        int tmp = heap[idx];


//        int i = idx;
//        while (i < size) {
//            int left = leftChild(i);
//            int right = rightChild(i);
//            if (left < size && right < size) {
//                if (heap[left] < heap[right]) {
//                    heap[i] = heap[left];
//                    i = left;
//                } else {
//                    heap[i] = heap[right];
//                    i = right;
//                }
//            } else if (left < size) {
//                heap[i] = heap[left];
//                i = left;
//            } else if (right < size) {
//                heap[i] = heap[right];
//                i = right;
//            } else {
//                break;
//            }
//        }
//
//        if (i < size) {
//            int sliding = 0;
//            if (i % 2 == 0) {//right
//                sliding = leftChild(parent(i));
//            } else {
//                sliding = rightChild(parent(i));
//            }
//
//            heap[i] = heap[sliding];
//        }

//        size--;

        decreaseKey(idx,Integer.MIN_VALUE);
        extractMin();

        return tmp;
    }

    /**
     * @param idx the index of element to replace
     * @param num
     * @return the old element at index
     */
    public int decreaseKey(int idx, int num) {
        if (idx < 0 || idx >= size) {
            throw new IllegalArgumentException("the index " + idx + " is illegal.");
        }

        int old = heap[idx];

        heap[idx] = num;

        int i = idx;
        while (i > 0 && heap[parent(i)] > heap[i]) {
            swap(heap,parent(i),i);
            i = parent(i);
        }

        //        if (i == idx) {
        //            while (i < size) {
        //                int left = leftChild(i);
        //                int right = rightChild(i);
        //                if ((left < size && right >= size) || (left < size && right < size && heap[left] <
        // heap[right])) {
        //                    if (heap[left] < heap[i]) {
        //                        heap[i] = heap[left];
        //                        i = left;
        //                    } else {
        //                        break;
        //                    }
        //                } else if ((left >= size && right < size) || (left < size && right < size && heap[left] >=
        //                        heap[right])) {
        //                    if (heap[right] < heap[i]) {
        //                        heap[i] = heap[right];
        //                        i = right;
        //                    } else {
        //                        break;
        //                    }
        //                } else {
        //                    break;
        //                }
        //            }
        //        }
        return old;
    }

    //    /**
    //     * @param num the number to be searched
    //     * @return the index of element if found, otherwise, -1;
    //     */
    //    public int find(int num) {
    //        return find(0, num);
    //    }
    //
    //    private int find(int idx, int num) {
    //        if (idx >= size) {
    //            return -1;
    //        }
    //
    //        if (heap[idx] == num) {
    //            return idx;
    //        } else if (heap[idx] > num) {
    //            return -1;
    //        } else {
    //            int targetIdx = find(leftChild(idx), num);
    //            if (targetIdx != -1) {
    //                return targetIdx;
    //            }
    //            targetIdx = find(rightChild(idx), num);
    //            if (targetIdx != -1) {
    //                return targetIdx;
    //            }
    //        }
    //        return -1;
    //    }

    public int size() {
        return size;
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i]);
            if (i != size - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
