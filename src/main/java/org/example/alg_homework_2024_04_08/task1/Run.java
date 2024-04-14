package org.example.alg_homework_2024_04_08.task1;

public class Run {

//  1) Создать MyLinkedList объект.
//  Создать искусственно петлю в связном списке.
//  Написать метод detectLoop, который проверяет, есть ли петля в MyLinkedList.

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        System.out.println(" - pushToHead - ");
        list.pushToHead(5);
        list.pushToHead(3);
        list.pushToHead(6);
        list.pushToHead(8);
        list.pushToHead(4);
        list.print();
        System.out.println("List size = " + list.size());

        list.createLoop(2);
//        list.print(); //Заходит в бесконечный цикл, если список с петлей.
        System.out.println(list.detectLoop());
    }
}


