package org.example.alg_homework_2024_04_08.task1;

import java.util.HashSet;
import java.util.Set;

public class MyLinkedList {

//    Создать MyLinkedList объект.
//    Создать искусственно петлю в связном списке.
//    Написать метод detectLoop, который проверяет, есть ли петля в MyLinkedList.

    Node head;

    public void pushToHead(int data) {
        Node newNode = new Node(data, null);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.setNext(head);
        head = newNode;
    }


    public void createLoop(int index) {
        if (index < 0 || index > size()-1) {
            System.out.println("Невозможно создать петлю по данному индексу.");
            return;
        }

        Node current = head;
        Node loopStart = null;

        int count = 0;
        while (current != null) {
            if (count == index) {
                loopStart = current;
            }
            if (current.getNext() == null) {
                current.setNext(loopStart);
                break;
            }
            current = current.getNext();
            count++;
        }
    }

    public boolean detectLoop() {
        Set<Node> visitedNodes = new HashSet<>();
        while (head != null) {
            if (visitedNodes.contains(head)) {
                return true;
            }
            visitedNodes.add(head);
            head = head.getNext();
        }
        return false;
    }

    public void print() {
        Node node = head;
        while (node != null) {
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }
        System.out.println();
    }

    public int size() {
        Node node;
        int count = 0;
        for (node = head; node != null; node = node.getNext()) {
            count++;
        }
        return count;
    }
}
