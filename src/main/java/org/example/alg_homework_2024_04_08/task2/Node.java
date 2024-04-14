package org.example.alg_homework_2024_04_08.task2;

public class Node {

//  2* Переделать односвязный список MyLinkedList в двусвязный

    private int data;
    private Node next;
    private Node previous;

    public Node(int data)
    {
        this.data = data;
        this.previous = null;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
