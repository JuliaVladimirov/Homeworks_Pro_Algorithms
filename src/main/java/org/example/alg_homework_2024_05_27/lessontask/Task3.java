package org.example.alg_homework_2024_05_27.lessontask;

//Задача с урока

import java.util.Arrays;
import java.util.Collections;

public class Task3 {

    public static void findPairSumTwoPoint(int[] array1, int[] array2, int[] array3) {
        int length1 = array1.length;
        int length2 = array2.length;
        int length3 = array3.length;

        int firstElement = array1[0];
        int secondElement = array2[0];
        int thirdElement = array3[0];

        int min = (int) Collections.min(Arrays.asList(array1[0],array2[0],array3[0]));
        int max = (int) Collections.max(Arrays.asList(array1[0],array2[0],array3[0]));


        int minModul = Math.abs(max - min);



        int i = 0; // first pointer
        int j = 0; // second pointer
        int k = 0;// third pointer

        while (i < length1 && j < length2 && k < length3) {
            int tempMin = (int) Collections.min(Arrays.asList(array1[i],array2[j],array3[k]));
            int tempMax = (int) Collections.max(Arrays.asList(array1[i],array2[j],array3[k]));

            int tempModul = Math.abs(tempMax - tempMin);
            if (minModul > tempModul) {
                minModul = tempModul;
                firstElement = array1[i];
                secondElement = array2[j];
                thirdElement = array3[k];
            }

            if(array1[i] < array2[j] && array1[i] < array3[k]) {
                i++;
            } else if (array2[j] < array3[k]) {
                j++;
            } else {
                k++;
            }

        }
        System.out.println(firstElement);
        System.out.println(secondElement);
        System.out.println(thirdElement);

    }

    public static void main(String[] args) {
        int[] array1 = {1, 29, 10, 2};
        int[] array2 = {8, 31, 25};
        int[] array3 = {4, 19, 35};


        findPairSumTwoPoint(array1, array2, array3);

    }

}
