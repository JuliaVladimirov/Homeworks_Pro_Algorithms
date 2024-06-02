package org.example.alg_homework_2024_05_27;

//    1) СКОЛЬЗЯЩЕЕ ОКНО
//    Дан массив целых чисел размера «n», наша цель — вычислить минимальную сумму «k» последовательных элементов в массиве.
//
//    Ввод: arr[] = {10, 20, 30, 40}, k = 2
//    Вывод: 30
//
//    Вход: arr[] = {1, 45, 2, 10, 23, 3, 1, 0, 20}, k = 4
//    Выход: 24
//    Мы получаем минимальную сумму, добавляя подмассив {3, 1, 0, 20} размера 4.

public class Task1 {

    public static int minSumWithSlidingWindowMethod(int[] array, int k) {

        if (array.length < k) {
            System.out.println("The given array is less than the length of the given window.");
            return -1;
        }

        int minSum = 0;
        for (int i = 0; i < k; i++)
            minSum += array[i];

        int windowSum = minSum;
        for (int i = k; i < array.length; i++) {
            windowSum += array[i] - array[i - k];
            minSum = Math.min(minSum, windowSum);
        }

        return minSum;
    }

    public static void main(String[] args) {

        int[] array1 = {10, 20, 30, 40};
        int k1 = 2;
        System.out.println(minSumWithSlidingWindowMethod(array1, k1));

        int[] array2 = {1, 45, 2, 10, 23, 3, 1, 0, 20};
        int k2 = 4;
        System.out.println(minSumWithSlidingWindowMethod(array2, k2));
    }
}
