package org.example;

public class PrimeNumbers {

    public static void main(String[] args) {

//2. Написать проверку числа "простое" ли оно, используя итерационный подход. (не рекурсия)

        System.out.println(isPrime(7));
        System.out.println(isPrime(10));
        System.out.println(isPrimeBetter(7));
        System.out.println(isPrimeBetter(10));
    }

    private static boolean isPrime(int number) { // просто переписанная рекурсия
        if (number == 0 || number == 1) {
            return true;
        }
        for (int i = 2; i <= number; i++) {
            if (number == i) {
                return true;
            }
            if (number % i == 0) {
                return false;
            }
        }
        return false;
    }


    private static boolean isPrimeBetter(int number) {// улучшенный вариант
        if (number == 0 || number == 1) {
            return true;
        }
        if (number % 2 == 0) {//Следующий самый маленький делитель после 0 и 1 - это 2. Если число делится на 2, то оно уже не простое.
            return false;
        }
// Если число не прошло проверку на 2, значит оно нечетное, поэтому начинаем проверку уже с 3, прыгая через число (по нечетным числам).
// Проверяем число только до половины, поскольку, если число не простое, то потенциальные делители находятся в первой половине числа.
        for (int i = 3; i <= number / 2; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
