package org.example.alg_homework_2024_03_20.quicksort;

import java.util.Arrays;
import java.util.Stack;

public class QuickSort {

//    Возвращаю долг :)
//  Реализовать Quick sort используя итерационный подход.

    public static void main(String[] args) {

        int[] array = {7, -2, 4, 5, 1, 6, 15, 5, 0, -4, 2, 2};

        System.out.println(Arrays.toString(array));
        quickSortIterative(array);
        System.out.println(Arrays.toString(array));

    }

    public static void quickSortIterative(int[] array) {

        Stack<int[]> stack = new Stack<>();

        int[]limits = new int[2];
        limits[0] = 0;
        limits[1] = array.length - 1;

        stack.push(limits);

        while (!stack.empty())
        {
            int start = stack.peek()[0];
            int end = stack.peek()[1];
            stack.pop();

            int pivot = partition(array, start, end);


            if (pivot - 1 > start) {
                limits = new int[2];   // определяем границы нового подмассива
                limits[0] = start;     // который начинается с начала родительского массива
                limits[1] = pivot -1;  // и заканчивается перед элементом pivot
                stack.push(limits);    // добавляем в stack
            }


            if (pivot + 1 < end) {
                limits = new int[2];   // определяем границы нового подмассива
                limits[0] = pivot + 1; // который начинается сразу после pivot
                limits[1] = end;       // и заканчивается в конце родительского массива
                stack.push(limits);    // добавляем в stack
            }
        }
    }


    static int partition(int[] array, int start, int end) {
        int pivot = array[end];

        int  separator = (start - 1); // вспомогательный индекс для swap и для определения нового pivot
        for (int j = start; j <= end - 1; j++) {

            if (array[j] <= pivot) {
                separator++;

                int temp = array[separator];
                array[separator] = array[j];
                array[j] = temp;
            }
        }

        separator++;
        int temp = array[separator];
        array[separator] = array[end];
        array[end] = temp;

        return separator;
    }
}
