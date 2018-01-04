package org.algo.sort;

/**
 * Mergesort is a comparision-based and divide-and-conquer algorithm.
 * It has features below:
 * <ul>
 *     <li>parallel</li>
 *     <li>stable</li>
 *     <li>efficient on large sets</li>
 * </ul>
 * It has two version: top-down version and bottom-up version.<br>
 * Its time compexity is O(nlogn), and space complexity is O(n);
 *
 * @author amos
 * @date 2016-10-15
 */
public class Merge{
    public static void mergeSort(int[] arr, int lIdx, int uIdx) {
        if (lIdx == uIdx) {
            return;
        } else {
            int mid = (lIdx + uIdx) >> 1;
            mergeSort(arr, lIdx, mid);
            mergeSort(arr, mid + 1, uIdx);

            merge(arr, lIdx, mid + 1, uIdx);
        }
    }

    /**
     * @param arr  需要排序的数组
     * @param lIdx 数组的较小的下标
     * @param mid  中间元素的下标
     * @param uIdx 较大元素的下标
     */
    private static void merge(int[] arr, int lIdx, int mid, int uIdx) {
        int lk = lIdx;
        int luIdx = mid - 1;
        int uk = mid;

        int ck = 0;

        int size = uIdx - lIdx + 1;

        int[] tmpArr = new int[size];

        while (lk <= luIdx && uk <= uIdx) {
            if (arr[lk] < arr[uk]) {
                tmpArr[ck] = arr[lk];
                lk++;
            } else {
                tmpArr[ck] = arr[uk];
                uk++;
            }
            ck++;
        }

        if (lk <= luIdx) {
            while (lk <= luIdx) {
                tmpArr[ck] = arr[lk];
                lk++;
                ck++;
            }
        } else {
            while (uk <= uIdx) {
                tmpArr[ck] = arr[uk];
                uk++;
                ck++;
            }
        }

        for (int i = 0; i < size; i++) {
            arr[lIdx + i] = tmpArr[i];
        }

    }

    public static void mergeSortTopDown(int[] arr) {
        int[] arrCopy = new int[arr.length];
        merge2(arr, 0, arr.length, arrCopy);
    }

    private static void merge2(int[] arr, int low, int high, int[] arrCopy) {
        if (high - low == 1) {
            //arrCopy[low] = arr[low];
            return;
        }

        int middle = (low + high) >> 1;
        merge2(arr, low, middle, arrCopy);
        merge2(arr, middle, high, arrCopy);

        int i = low;
        int j = middle;

        for (int k = low; k < high; k++) {
            //            if (i < middle && j < high && arr[i] <= arr[j]) {
            //                arrCopy[k] = arr[i];
            //                i++;
            //            } else if (i < middle && j < high && arr[i] > arr[j]) {
            //                arrCopy[k] = arr[j];
            //                j++;
            //            } else if (i < middle && j >= high) {
            //                arrCopy[k] = arr[i];
            //                i++;
            //            } else if (i >= middle && j < high) {
            //                arrCopy[k] = arr[j];
            //                j++;
            //            }

            if (i < middle && (j >= high || arr[i] <= arr[j])) {
                arrCopy[k] = arr[i];
                i++;
            } else {
                arrCopy[k] = arr[j];
                j++;
            }
        }

        System.arraycopy(arrCopy, low, arr, low, high - low);
    }

    public static void mergeSortBottomUp(int[] arr) {
        int len = arr.length;
        int[] arrCopy = new int[len];

        int width = 1;
        while (width < len) {
            for (int l = 0; l < len; ) {
                int low = l;
                int j = low;

                int middle = Math.min(low + width, len);
                int k = middle;

                int high = Math.min(middle + width, len);

                while (l < high) {
                    if (j < middle && (k >= high || arr[j] <= arr[k])) {
                        arrCopy[l] = arr[j];
                        j++;
                    } else {
                        arrCopy[l] = arr[k];
                        k++;
                    }
                    l++;
                }
            }
            System.arraycopy(arrCopy, 0, arr, 0, len);

            width = width << 1;
        }
    }
}