package org.algo;

public class AlgoBaseUtils{
    private AlgoBaseUtils(){}

    public static void print(int[] arr) {
        for (int a : arr) {
            System.out.print(a + ",");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}