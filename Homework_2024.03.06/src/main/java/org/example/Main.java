package org.example;

//Написать самостоятельно сортировку слиянием.
//Написать merge sort, которая будет сортировать массив в порядке убывания значения элементов.

import java.util.Arrays;

public class Main {
    public static void main(String args[]) {

        int[] arr = {1, 38, 27, 43, 3, 9, 82, 10, 5, 67, 34};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void mergeSort(int[] arr) {
        int lengthArr = arr.length;
        if(lengthArr == 1) {
            return;
        }
        int mid = (lengthArr % 2 != 0) ? lengthArr/2 + 1 : lengthArr/2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[lengthArr - mid];

        for (int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];
        }

        for (int j = 0; j < lengthArr - mid; j++) {
            rightArr[j] = arr[j + mid];
        }

        mergeSort(leftArr);
        mergeSort(rightArr);

        merge(arr, leftArr, rightArr);
    }

    private static void merge(int[] arr, int[] leftArr, int[] rightArr) {
        int leftArrLength = leftArr.length;
        int rightArrLength = rightArr.length;


        int leftIndex = 0;
        int rightIndex = 0;


        int arrIndex = 0;

        while (leftIndex < leftArrLength && rightIndex < rightArrLength) {
            if (leftArr[leftIndex] > rightArr[rightIndex]) {
                arr[arrIndex] = leftArr[leftIndex];

                leftIndex++;
                arrIndex++;
            } else {
                arr[arrIndex] = rightArr[rightIndex];
                rightIndex++;
                arrIndex++;
            }
        }


        while (leftIndex < leftArrLength) {
            arr[arrIndex] = leftArr[leftIndex];
            leftIndex++;
            arrIndex++;
        }


        while (rightIndex < rightArrLength) {
            arr[arrIndex] = rightArr[rightIndex];
            rightIndex++;
            arrIndex++;
        }
    }
}