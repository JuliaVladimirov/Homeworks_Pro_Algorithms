package org.example.lesson_2024_04_22.task2;

import java.util.ArrayList;
import java.util.List;

public class CombinationLock {

//  Вам дан замок, состоящий из n различных круглых колец, на каждом из которых последовательно напечатаны цифры от 0 до 9.
//  Изначально все n-колец вместе показывают n-значное целое число, но существует только определенный код, который может открыть замок.
//  Вы можете вращать каждое кольцо любое количество раз в любом направлении.
//  Вы должны найти минимальное количество оборотов на кольцах замка, чтобы открыть замок.
//  Ввод: Ввод = 2345, Код разблокировки = 5432
//  Выход: требуется оборотов = 8
//  Объяснение: 1-е кольцо вращается трижды, как 2->3->4->5 (тогда как в обратную сторону 2->1->0->9->8->7->6->5)
//              2-е кольцо вращается один раз как 3->4
//              3-е кольцо поворачивается один раз как 4->3
//              4-е кольцо вращается трижды как 5->4->3->2
//
//  Ввод: Ввод = 1919, Код разблокировки = 0000
//  Выход: требуется оборотов = 4
//  Объяснение: 1-е кольцо вращается один раз как 1-> 0
//              2-е кольцо поворачивается один раз как 9-> 0
//              3-е кольцо вращается один раз как 1-> 0
//              4-е кольцо поворачивается один раз как 9->0


    int start;
    int end;

    public CombinationLock(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getMin() {
        int rotation = Math.min(Math.abs(end - start), 10 - Math.abs(end - start));
        return rotation;
    }

    public static void main(String[] args) {

        List<CombinationLock> combinationOfDigits = new ArrayList<>();
        combinationOfDigits.add(new CombinationLock(2, 5));
        combinationOfDigits.add(new CombinationLock(3, 4));
        combinationOfDigits.add(new CombinationLock(4, 3));
        combinationOfDigits.add(new CombinationLock(5, 2));

        int count = 0;
        for (CombinationLock digits : combinationOfDigits) {
            count += digits.getMin();
        }
        System.out.println("Количество ротаций = " + count);
    }
}

