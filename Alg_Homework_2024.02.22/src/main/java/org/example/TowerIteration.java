package org.example;


public class TowerIteration {

    public static void main(String[] args) {
        int numOfWheels = 3;
        towerOfHanoiZero(numOfWheels, 'A', 'C', 'B');
    }

    public static void towerOfHanoiZero(int numOfWheels, char source, char destination, char helper) {
        if (numOfWheels == 0){
            System.out.println("No disks");
        }
        int moves = (int) (Math.pow(2, numOfWheels) - 1);
        if (numOfWheels % 2 ==0) {
            char temp = destination;
            destination = helper;
            helper = temp;
        }

        for (int i = 1; i <= moves; i++) {
            if (i % 3 == 1) {
                System.out.println("Take disk from tower " + source + " to tower " + destination);
            }
            if (i % 3 == 2) {
                System.out.println("Take disk from tower " + source + " to tower " + helper);
            }
            if (i % 3 == 0) {
                System.out.println("Take disk from tower " + helper + " to tower " + destination);
            }
        }
    }
}
