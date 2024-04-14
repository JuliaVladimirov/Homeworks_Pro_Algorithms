package org.example.alg_homework_2024_04_08.task2;

public class Run {
    public static void main(String[] args) {

//  2* Переделать односвязный список MyLinkedList в двусвязный

        DoublyLinkedList list = new DoublyLinkedList();
        System.out.println("1. pushToHead()");
        list.pushToHead(5);
        list.pushToHead(3);
        list.pushToHead(6);
        list.pushToHead(8);
        list.pushToHead(4);
        list.print();

        System.out.println("2. pushToTail()");
        list.pushToTail(7);
        list.print();

        System.out.println("3. pushToIndex()");
        list.pushToIndex(10, 2);
        list.print();

        System.out.println("4. removeFirst()");
        list.removeFirst();
        list.print();

        System.out.println("5. removeLast()");
        list.removeLast();
        list.print();

        System.out.println("6. remove()");
        list.remove(1);
        list.print();

        System.out.println("7. size()");
        System.out.println(list.size());

        System.out.println("8. get()");
        System.out.println(list.get(1));
    }

}
