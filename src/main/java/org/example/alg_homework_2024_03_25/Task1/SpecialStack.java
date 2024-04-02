package org.example.alg_homework_2024_03_25.Task1;

//  1) Задача getMin().
//  Реализовать структуру данных SpecialStack, которая поддерживает все операции со стеком,
//  такие как push(), pop(), isEmpty(), … и дополнительную операцию getMin(),
//  которая должна возвращать минимальный элемент из SpecialStack.
//  Все эти операции SpecialStack должны быть O(1). Пространство O(n)
//  Чтобы реализовать SpecialStack, используйте структуру данных Stack, реализованную ранее в классе.

public class SpecialStack {
    private final int[] arr;
    private int top;
    private final int capacity;

    public SpecialStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

//  Push elements to the top of stack.
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack OverFlow");
        } else {
            // insert element on top of stack
            System.out.println("Inserting " + x);
            arr[++top] = x;
        }
    }

//  Pop elements from top of stack.
    public int pop() {
        // if stack is empty no element to pop
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        // pop element from top of stack
        return arr[top--];
    }

// … и дополнительную операцию getMin(), которая должна возвращать минимальный элемент из SpecialStack.
    public int getMin(){
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int min = arr[0];
        for (int i = 1; i <= top; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

//  Returns size of the stack.
    public int getSize() {
        return top + 1;
    }

//  Check if the stack is empty.
    public boolean isEmpty() {
        return top == -1;
    }

//  Check if the stack is full.
    public boolean isFull() {
        return top == capacity - 1;
    }

//  To see the first element to pop in the stack. The stack remains unchanged.
    public int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return arr[top];
        }
    }

//  Display elements of stack.
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
