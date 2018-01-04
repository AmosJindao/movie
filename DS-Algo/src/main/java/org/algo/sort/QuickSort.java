package org.algo.sort;

/**
 * https://zh.wikipedia.org/wiki/%E5%BF%AB%E9%80%9F%E6%8E%92%E5%BA%8F
 * 快速排序使用分治法（Divide and conquer）策略来把一个序列（list）分为两个子序列（sub-lists）。
 * <p>经典快速排序的步骤为：
 * <ul>
 * <li>从数列中挑出一个元素，称为"基准"（pivot），</li>
 * <li>重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。
 * 在这个分区结束之后，该基准就处于数列的中间位置。这个称为分区（partition）操作。
 * <li>递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序。
 * </ul>
 * 递归的最底部情形，是数列的大小是零或一，也就是永远都已经被排序好了。虽然一直递归下去，但是这个算法总会结束，
 * 因为在每次的迭代（iteration）中，它至少会把一个元素摆到它最后的位置去。
 * </p>
 *
 * @author amos
 * @date 2016-10-15
 */
public final class QuickSort{

    /**
     * @param arr
     * @param leftIdx
     * @param rightIdx valid index
     */
    public static final void quickSort(int[] arr, int leftIdx, int rightIdx) {
        if (leftIdx >= rightIdx) {
            return;
        }

        int pivotIdx = partition(arr, leftIdx, rightIdx);

        quickSort(arr, leftIdx, pivotIdx - 1);
        quickSort(arr, pivotIdx + 1, rightIdx);

    }

    private static int partition(int[] arr, int leftIdx, int rightIdx) {
        int mid = (leftIdx + rightIdx) >> 1;

        int pivot = arr[mid];

        arr[mid] = arr[rightIdx];

        while (leftIdx < rightIdx) {
            while (leftIdx < rightIdx && arr[leftIdx] < pivot) {
                leftIdx++;
            }

            if (leftIdx < rightIdx) {
                arr[rightIdx] = arr[leftIdx];
                rightIdx--;
            }

            while (rightIdx > leftIdx && arr[rightIdx] > pivot) {
                rightIdx--;
            }

            if (rightIdx > leftIdx) {
                arr[leftIdx] = arr[rightIdx];
                leftIdx++;
            }
        }

        arr[leftIdx] = pivot;

        return leftIdx;
    }

    public static final void dualPivotQuickSort(int[] arr, int leftIdx, int rightIdx) {
        //TODO to implement dual-pivot quick sort
//        if (leftIdx >= rightIdx) {
//            return;
//        }
//
//        int pivot1Idx = (rightIdx - leftIdx + 1) / 4;
//        int pivot2Idx = (rightIdx - leftIdx + 1) * 3 / 4;
//
//        int pivot1 = arr[pivot1Idx];
//        int pivot2 = arr[pivot2Idx];
//
//        arr[pivot1Idx] = arr[leftIdx];
//        arr[pivot2Idx] = arr[rightIdx];
//
////        if (pivot1 == pivot2) {
////
////        } else {
//            if (pivot1 > pivot2) {
//                pivot1 = pivot1 ^ pivot2;
//                pivot2 = pivot1 ^ pivot2;
//                pivot1 = pivot1 ^ pivot2;
//            }
//
//            /*
//            -------|-------|------|-------
//                   left    k      right
//             < pivot1, before left
//             pivot1<= <=pivot2, between left and k, exclusive
//             > pivot2, after right
//           */
//
//            for (int k = leftIdx + 1; k < rightIdx; k++) {
//                if (arr[k] < pivot1) {
//                    arr[leftIdx] = arr[k];
//                    leftIdx++;
//                    //                    k++;
//                } else if (arr[k] > pivot2) {
//                    arr[rightIdx] = arr[k];
//
//                    while (arr[--rightIdx] > pivot2) {
//                        ;
//                    }
//
//                    if (arr[rightIdx] < pivot1) {
//                        arr[leftIdx] = arr[rightIdx];
//                        leftIdx++;
//                        arr[k] = arr[leftIdx];
//                        //                        k++;
//                    } else {
//                        arr[k] = arr[rightIdx];
//                        //                        k++;
//                    }
//                }
//                //                else {
//                //                    k++;
//                //                }
//            }
//
//            arr[leftIdx] = pivot1;
//            arr[rightIdx] = pivot2;
////        }

    }
}
