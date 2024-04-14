package org.example.alg_homework_2024_03_25.task2;

//  2*) Реализовать структуру данных SpecialQueue, которая поддерживает все операции с очередью,
//  … и дополнительную операцию getMax(),
//  которая должна возвращать максимальный элемент из SpecialQueue.
//  Чтобы реализовать SpecialQueue, используйте структуру данных Queue, реализованную ранее в классе.

public class TestSpecialQueue {

    public static void main(String[] args) {
        SpecialQueue queue = new SpecialQueue(8);

//  Push an element to the end of the queue.
        queue.pushToEnd(1);
        queue.pushToEnd(2);
        queue.pushToEnd(3);
        queue.pushToEnd(4);
        System.out.println();

        System.out.print("Queue: ");
        queue.printQueue();
        System.out.println();

//  Remove element from the head of the queue.
        queue.removeFromHead();
        System.out.println("After pop out");
        queue.printQueue();
        System.out.println();

//  Peek an element in the queue.
        System.out.println("Call peek()");
        System.out.println(queue.peekFromHead());
        System.out.println("After peek out");
        queue.printQueue();
        System.out.println();

//  Get the maximal element in the queue, without deleting it. Returns element from the queue.
        System.out.println("The max element: " + queue.getMax());

    }
}
