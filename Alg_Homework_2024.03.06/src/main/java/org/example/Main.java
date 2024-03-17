package org.example;

//Написать самостоятельно сортировку слиянием.
//Написать merge sort, которая будет сортировать массив в порядке убывания значения элементов.

import java.util.Arrays;

public class Main {
    public static void main(String args[]) {

        int[] array = {1, 38, 27, 43, 3, 9, 82, 10, 5, 67, 34};
        System.out.println(Arrays.toString(array));
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
    private static void mergeSort(int[] array) {
        int arrayLength = array.length;
        if(arrayLength == 1) {
            return;
        }
        int middle = (arrayLength % 2 != 0) ? arrayLength/2 + 1 : arrayLength/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[arrayLength - middle];

        for (int i = 0; i < middle; i++) {
            leftArray[i] = array[i];
        }

        for (int j = 0; j < arrayLength - middle; j++) {
            rightArray[j] = array[j + middle];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(array, leftArray, rightArray);
    }

    private static void merge(int[] array, int[] leftArray, int[] rightArray) {
        int leftArrayLength = leftArray.length;
        int rightArrayLength = rightArray.length;


        int leftIndex = 0;
        int rightIndex = 0;


        int arrayIndex = 0;

        while (leftIndex < leftArrayLength && rightIndex < rightArrayLength) {
            if (leftArray[leftIndex] > rightArray[rightIndex]) {
                array[arrayIndex] = leftArray[leftIndex];

                leftIndex++;
                arrayIndex++;
            } else {
                array[arrayIndex] = rightArray[rightIndex];
                rightIndex++;
                arrayIndex++;
            }
        }


        while (leftIndex < leftArrayLength) {
            array[arrayIndex] = leftArray[leftIndex];
            leftIndex++;
            arrayIndex++;
        }


        while (rightIndex < rightArrayLength) {
            array[arrayIndex] = rightArray[rightIndex];
            rightIndex++;
            arrayIndex++;
        }
    }
}