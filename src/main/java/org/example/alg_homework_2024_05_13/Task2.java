package org.example.alg_homework_2024_05_13;

//2*. Для задания, которое выполняли в классе, реализуйте поиск с использованием MAP:

//  Первый элемент, встречающийся k раз в массиве

//  Дан массив из n целых чисел. Задача состоит в том, чтобы найти первый элемент, который встречается k раз.
//  Если ни один элемент не встречается k раз, выведите -1.
//  Распределение целочисленных элементов может быть в любом диапазоне.

//Ввод : {1, 7, 4, 3, 4, 8, 7}, k = 2
//Вывод : 7
//Объяснение: 7 и 4 встречаются 2 раза. Но 7 — это первое, которое встречается 2 раза.

import java.util.HashMap;

public class Task2 {
    public static void main(String[] args) {

        int[] array = {1, 7, 4, 3, 4, 8, 7};
        int n = array.length;
        int k = 2;
        System.out.print("The first Number that appeared twice is: " + firstElementNative(array, n, k));
    }

    public static int firstElementNative(int[] array, int n, int k) {
        HashMap<Integer, Integer> mapForChecking = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int count = 0;
            if (mapForChecking.get(array[i]) != null) {
                count = mapForChecking.get(array[i]);
            }
            mapForChecking.put(array[i], count + 1);
        }
        for (int i = 0; i < n; i++) {
            if (mapForChecking.get(array[i]) == k) {
                return array[i];
            }
        }
        return -1;
    }
}
