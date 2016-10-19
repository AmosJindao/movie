package org.algo.sort;

/**
 * @author amos
 * @date 2016-10-15
 */
public class QuickSort{
    public static final void quickSort(int[] arr, int leftIdx, int rightIdx) {
        if(leftIdx >= rightIdx){
            return;
        }
        int pivot = arr[rightIdx];
        int leftIdxTmp = leftIdx-1;
        int rightIdxTmp = rightIdx;

        while (true) {
            while (leftIdxTmp < rightIdx && arr[++leftIdxTmp] < pivot)
                ;

            while (rightIdxTmp > leftIdx && arr[--rightIdxTmp] > pivot)
                ;

            if(leftIdxTmp >= rightIdxTmp) {
                break;
            }else {
                swap(arr, leftIdxTmp, rightIdxTmp);
            }
        }
                swap(arr, leftIdxTmp, rightIdx);

        quickSort(arr, leftIdx,leftIdxTmp-1);
        quickSort(arr, leftIdxTmp+1,rightIdx);

    }

    private static void swap(int[] arr, int leftIdx, int rightIdx) {
        int tmp = arr[leftIdx];
        arr[leftIdx] = arr[rightIdx];
        arr[rightIdx] = tmp;
    }
}
