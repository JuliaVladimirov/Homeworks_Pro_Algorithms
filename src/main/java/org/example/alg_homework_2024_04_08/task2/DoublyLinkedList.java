package org.example.alg_homework_2024_04_08.task2;

public class DoublyLinkedList {

//  2* Переделать односвязный список MyLinkedList в двусвязный

    Node head;
    Node tail;

    public DoublyLinkedList()
    {
        this.head = null;
        this.tail = null;
    }

    public void pushToHead(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            tail = temp;
        }
        else {
            temp.setNext(head);
            head.setPrevious(temp);
            head = temp;
        }
    }

    public void pushToTail(int data) {
        Node temp = new Node(data);
        if (tail == null) {
            head = temp;
            tail = temp;
        }
        else {
            tail.setNext(temp);
            temp.setPrevious(tail);
            tail = temp;
        }
    }

    public void pushToIndex(int data, int index) {
        Node temp = new Node(data);
        if (index == 0) {
            pushToHead(data);
        }
        else {
            Node current = head;
            int currPosition = 1;
            while (current != null && currPosition < index) {
                current = current.getNext();
                currPosition++;
            }
            if (current == null) {
                pushToTail(data);
            }
            else {
                temp.setNext(current);
                temp.setPrevious(current.getPrevious());
                current.getPrevious().setNext(temp);
                current.setPrevious(temp);
            }
        }
    }

    public void removeFirst() {
        if (head == null) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        Node temp = head;
        head = head.getNext();
        head.setPrevious(null);
        temp.setNext(null);
    }

    public void removeLast() {
        if (tail == null) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        Node temp = tail;
        tail = tail.getPrevious();
        tail.setNext(null);
        temp.setPrevious(null);
    }

    public void remove(int index) {

        if (index < 0 || index > size()-1) {
            System.out.println("Индекс не корректен.");
            return;
        }

        if (head == null) {
            System.out.println("Список пуст.");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        Node current = head;
        int count = 0;

        while (current != null && count != index) {
            current = current.getNext();
            count++;
        }

        if (current == tail) {
            removeLast();
            return;
        }

        current.getPrevious().setNext(current.getNext());
        current.getNext().setPrevious(current.getPrevious());
        current.setPrevious(null);
        current.setNext(null);
    }

    public int size() {
        Node node;
        int count = 0;
        for (node = head; node != null; node = node.getNext()) {
            count++;
        }
        return count;
    }
    public int get(int index) {
        int count = -1;
        if (head == null) {
            return -1;
        }
        if (index < 0 || index > size()) {
            return -1;
        }

        Node node = head;
        while (node != null) {
            count++;
            if (count == index) {
                return node.getData();
            }
            node = node.getNext();
        }
        return -1;
    }

    public void print() {
        Node node = head;
        while (node != null) {
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }
        System.out.println();
    }
}
