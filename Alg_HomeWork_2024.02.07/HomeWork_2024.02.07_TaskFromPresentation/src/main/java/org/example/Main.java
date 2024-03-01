package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Input the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Input the second number: ");
        int num3 = sc.nextInt();

        System.out.println("The sum of " + num1 + "," + num2 + "," + num3 + " is: " + getSum(num1, num2, num3));
    }

    public static int getSum(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum;
    }
}