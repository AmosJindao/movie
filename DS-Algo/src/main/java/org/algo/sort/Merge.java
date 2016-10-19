package org.algo.sort;

/**
 * @author amos
 * @date 2016-10-15
 */
public class Merge {
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
	 *
	 * @param arr 需要排序的数组
	 * @param lIdx 数组的较小的下标
	 * @param mid 中间元素的下标
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
}