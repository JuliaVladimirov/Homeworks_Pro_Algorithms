package org.example.alg_homework_2024_03_25.task3;

//  3*) Создайте Stack данных, который не будет иметь ограничения по работе с памятью и нам будет
//      трудно увидеть сообщение "Stack OverFlow". Вспомните прошедшие уроки по Динамическому массиву.

public class UnlimitedStack {

    private int[] arr;
    private int top;
    private int capacity;
    private int PERCENT_CHANGE = 100 ;

    public UnlimitedStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

//  Stack OverFlow может возникнуть только при вызове метода push(), поэтому большинство других методов, созданных ранее, тут не нужны.
//  Исключение составляют методы isFull(), который используется в методе push(), и метод printStack() для вывода в консоль.

//  Push elements to the top of stack.
    public void push(int x) {
        if (isFull()) {
            int[] arr1 = new int[capacity + (capacity * PERCENT_CHANGE / 100)];
            for (int i = 0; i < capacity; i++) {
                arr1[i] = arr[i];
            }
            arr = arr1;
            capacity = arr.length;
            System.out.println("Inserting " + x);
            arr[++top] = x;
        } else {

            System.out.println("Inserting " + x);
            arr[++top] = x;
        }
    }

//  Check if the stack is full.
    public boolean isFull() {
        return top == capacity - 1;
    }

    //  Display elements of stack.
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
