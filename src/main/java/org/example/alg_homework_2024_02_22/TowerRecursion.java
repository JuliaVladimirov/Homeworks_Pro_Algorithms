package org.example.alg_homework_2024_02_22;

public class TowerRecursion {
    public static void main(String[] args) {
        int num = 3;
        towerOfHanoiZero(num, 'A', 'C', 'B');
    }

    public static void towerOfHanoi(int numOfWheels, char from, char to, char help) {
        if (numOfWheels == 1) {
            System.out.println("Take disk from tower " + from + " to tower " + to);
            return;
        }
        towerOfHanoi(numOfWheels - 1, from, help, to);
        System.out.println("Take disk from tower " + from + " to tower " + to);
        towerOfHanoi(numOfWheels - 1, help, to, from);
    }
    public static void towerOfHanoiZero(int numOfWheels, char from, char to, char help) {
        if (numOfWheels == 0) {
            return;
        }
//        action 1
        towerOfHanoi(numOfWheels - 1, from, help, to);
//        action 2
        System.out.println("Take disk from tower " + from + " to tower " + to);
        towerOfHanoi(numOfWheels - 1, help, to, from);
    }
}
