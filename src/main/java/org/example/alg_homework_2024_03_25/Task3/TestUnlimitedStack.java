package org.example.alg_homework_2024_03_25.Task3;

//  3*) Создайте Stack данных, который не будет иметь ограничения по работе с памятью и нам будет
//      трудно увидеть сообщение "Stack OverFlow". Вспомните прошедшие уроки по Динамическому массиву.

public class TestUnlimitedStack {
    public static void main(String[] args) {

        UnlimitedStack stack = new UnlimitedStack(1);

//  Push an element to the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

        System.out.print("Stack: ");
        stack.printStack();
        System.out.println();
    }
}
