package org.example.alg_homework_2024_03_20.task1;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        DynamicArray array1 = new DynamicArray(3);
        array1.fillInRow();
        System.out.println(Arrays.toString(array1.getArr()));

        DynamicArray array2 = new DynamicArray(5);
        array2.fillEven();
        System.out.println(Arrays.toString(array2.getArr()));

        DynamicArray array3 = new DynamicArray(5);
        array3.fillOdd();
        System.out.println(Arrays.toString(array3.getArr()));


//  создать метод добавления массива данных в конец нашего Динамического массива - addArray(int[] arrAdd)

        int[] numbers = {5, 5, 5};
        array1.addArray(numbers);
        System.out.println(Arrays.toString(array1.getArr()));


//  ** создать метод добавления массива данных по индексу в наш Динамический массив - addAtArray(int index, int[] arrAdd)

        array2.addAtArray(3, numbers);
        System.out.println(Arrays.toString(array2.getArr()));


//  создать метод удаления элемента по его значению в нашем Динамическом массиве boolean removeValue(int value),
//  который возвращает true, если объект найден и удален, иначе false.

        System.out.println(array3.removeValue(5));
        System.out.println(Arrays.toString(array3.getArr()));
    }
}