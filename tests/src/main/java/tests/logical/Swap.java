package tests.logical;

/**
 * @author amos
 * @date 2018-01-20
 */
public class Swap{

    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 5, 6};
        for (int a : arr) {
            System.out.print(a);
        }
        System.out.println();
        swap(arr, 0, 3);

        for (int a : arr) {
            System.out.print(a);
        }
        System.out.println();
    }
}
