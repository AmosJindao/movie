package org.algo.sort;

public class Shell {
    public static final void shellSort(int[] arr) {
		int dif = 1;
		while ((3 * dif + 1) < arr.length) {
			dif = 3 * dif + 1;
		}

		while (dif > 0) {

			for (int i = dif; i < arr.length; i++) {
				int tmp = arr[i];
				int j = i - dif;
				while (j >= 0) {
					if (tmp < arr[j]) {
						arr[j + dif] = arr[j];
					} else {
						break;
					}

					j = j - dif;
				}

				arr[j + dif] = tmp;
			}

			dif = (dif - 1) / 3;
		}
	}

	public static final void shellSort2(int[] arr) {
		int dif = 1;
		while ((3 * dif + 1) < arr.length) {
			dif = 3 * dif + 1;
		}

		while (dif > 0) {

			for (int i = 0; i < dif; i++) {
				for (int j = dif + i; j<arr.length; j=j+dif) {
					int tmp = arr[j];
					
					int k = j - dif;
					while (k >= 0) {
						if (tmp < arr[k]) {
							arr[k + dif] = arr[k];
						} else {
							break;
						}

						k = k - dif;
					}
					arr[k+dif] = tmp;
				}
			}

			dif = (dif - 1) / 3;
		}
	}
}