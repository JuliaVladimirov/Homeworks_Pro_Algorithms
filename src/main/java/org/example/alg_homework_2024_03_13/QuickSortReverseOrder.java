package org.example.alg_homework_2024_03_13;

import java.util.Arrays;

public class QuickSortReverseOrder {
    public static void main(String[] args) {

        int[] array = {7, -2, 4, 1, 6, 5, 0, -4, 2};
        quickSortRecursive(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

// 1. Quick sort пишем еще раз “с чистого листа”, но сортировка в порядке убывания значения.

    public static void quickSortRecursive(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int indexPivot = partition(array, start, end);
        quickSortRecursive(array, start, indexPivot - 1);
        quickSortRecursive(array, indexPivot + 1, end);
    }

    private static int partition(int[] array, int partitionStart, int partitionEnd) {
        int pivot = array[partitionEnd];
        int index = partitionStart;

        for (int i = partitionStart; i < partitionEnd; i++) {
            if(array[i] >= pivot) { //для изменения порядка сортировки нужно всего лишь поменять знак
                swap(array, i, index);
                index++;
            }
        }
        swap(array, partitionEnd, index);

        return index;
    }

    private static void swap(int[] array, int source, int destination) {
        int temp = array[source];
        array[source] = array[destination];
        array[destination] = temp;
    }
}

