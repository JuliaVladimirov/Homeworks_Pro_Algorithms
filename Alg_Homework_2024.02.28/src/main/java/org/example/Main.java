package org.example;

//Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент, который будет находиться на k-й позиции в конечном отсортированном массиве.
//Массив 1 - 100 112 256 349 770
//Массив 2 - 72 86 113 119 265 445 892
//к = 7
//Вывод : 256
//Окончательный отсортированный массив -
//72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
//7-й элемент этого массива равен 256.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
        int[] finalArr = new int[arr1.length + arr2.length];
        int k = 7;
        System.out.println("Под индексом " + k + " находится число " + mergeArrays(finalArr, arr1, arr2, k));
        System.out.println(Arrays.toString(finalArr));
    }

    private static int mergeArrays(int[] finalArr, int[] arr1, int[] arr2, int k) {
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;

        int arr1Index = 0;
        int arr2Index = 0;
        int arrIndex = 0;

        while (arr1Index < arr1Length && arr2Index < arr2Length) {
            if (arr1[arr1Index] < arr2[arr2Index]) {
                finalArr[arrIndex] = arr1[arr1Index];

                arr1Index++;
                arrIndex++;
            } else {
                finalArr[arrIndex] = arr2[arr2Index];
                arr2Index++;
                arrIndex++;
            }
        }

        while (arr1Index < arr1Length) {
            finalArr[arrIndex] = arr1[arr1Index];
            arr1Index++;
            arrIndex++;
        }

        while (arr2Index < arr2Length) {
            finalArr[arrIndex] = arr2[arr2Index];
            arr2Index++;
            arrIndex++;
        }

        return finalArr[k];
    }
}