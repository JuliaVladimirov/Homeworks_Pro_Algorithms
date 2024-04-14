package org.example.alg_homework_2024_03_25.task1;

//  1) Задача getMin().
//  Реализовать структуру данных SpecialStack, которая поддерживает все операции со стеком,
//  такие как push(), pop(), isEmpty(), … и дополнительную операцию getMin(),
//  которая должна возвращать минимальный элемент из SpecialStack.
//  Все эти операции SpecialStack должны быть O(1). Пространство O(n)
//  Чтобы реализовать SpecialStack, используйте структуру данных Stack, реализованную ранее в классе.

public class TestSpecialStack {

    public static void main(String[] args) {
        SpecialStack stack = new SpecialStack(8);

//  Push an element to the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.print("Stack: ");
        stack.printStack();
        System.out.println();

//  Remove an element from the stack.
        stack.pop();
        System.out.println("After pop out");
        stack.printStack();
        System.out.println();

//  Peek an element in the stack
        System.out.println("Call peek()");
        System.out.println(stack.peek());
        System.out.println("After peek out");
        stack.printStack();
        System.out.println();


//  Get the minimal element in the staCK, without deleting it. Returns element from the stack.
        System.out.println("The min element: " + stack.getMin());
    }
}
