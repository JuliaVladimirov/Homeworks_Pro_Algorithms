package org.example.alg_homework_2024_05_13;

//1. Проверьте, равны ли два массива или нет
//
//Два массива называются равными, если:
//оба они содержат один и тот же набор элементов,
//расположение (или перестановки) элементов может/не может быть одинаковым.
//Если есть повторения, то количество повторяющихся элементов также должно быть одинаковым, чтобы два массива были равны.
//
//Ввод: arr1[] = {1, 2, 5, 4, 0}, arr2[] = {2, 4, 5, 0, 1}
//Вывод: Да

import java.util.HashSet;

public class Task1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 4, 0};
        int[] arr2 = {2, 4, 5, 0, 1};
        System.out.println("These two arrays are identical: " + checkArrays(arr1, arr2));
    }


    public static boolean checkArrays(int[] array1, int[] array2) {

        HashSet<Integer> setForChecking = new HashSet<>();
        boolean result = true;
        for (int element : array1) {
            setForChecking.add(element);
        }

        for (int element : array2) {
            if (setForChecking.add(element)) {
                result = false;
            }
        }
        return result;
    }
}




