package org.example.alg_homework_2024_05_27;

//  2*) ДВА УКАЗАТЕЛЯ
//  Для двух заданных отсортированных в возрастающем порядке целочисленных массивов A и B длин n и m соответственно,
//  найти пару самых близких между собой по значению элементов. Более формально: найти такие элементы A[i] и B[j],
//  что их модуль разности минимален по сравнению с другими парами элементов из этих массивов.

//    Пример. Для заданных массивов {1, 2, 10} и {8, 20, 30} ответом будет пара чисел 10 и 8.

public class Task2 {

    public static void findPairSumTwoPoint(int[] array1, int[] array2) {
        int lengthN = array1.length;
        int lengthM = array2.length;

        int i = 0; // first pointer - the beginning of  array1
        int j = lengthM - 1; // second pointer - the end of array2

        int firstElement = array1[i];
        int secondElement = array2[j];
        int minModul = Math.abs(firstElement - secondElement);
        boolean flag = true;
        i =  1;

        while (i < lengthN && j < lengthM) {

            int tempModul = Math.abs(array1[i] - array2[j]);
            if (minModul > tempModul) {
                minModul = tempModul;
                firstElement = array1[i];
                secondElement = array2[j];
            }

            if (flag){
                j--;
            } else if (!flag){
                i++;
            }
            flag = !flag;
        }

        System.out.println(firstElement);
        System.out.println(secondElement);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 10};
        int[] array2 = {8, 20, 30};

        findPairSumTwoPoint(array1, array2);
    }

}
