package org.example.alg_homework_2024_03_25.task2;

//  2*) Реализовать структуру данных SpecialQueue, которая поддерживает все операции с очередью,
//  … и дополнительную операцию getMax(),
//  которая должна возвращать максимальный элемент из SpecialQueue.
//  Чтобы реализовать SpecialQueue, используйте структуру данных Queue, реализованную ранее в классе.

public class SpecialQueue {

    private int[] arr;      // array for save elements a queue
    private int head;       // head is point to first element of queue
    private int tail;       // tail is point to end element of queue
    private int capacity;   // max capacity of queueS
    private int count;      // current size of queue

    public SpecialQueue(int size) {
        arr = new int[size];
        capacity = size;
        head = 0;
        tail = -1;
        count = 0;
    }


//  Push an element at the end of queue. Parameter data is the element for inserting.
    public void pushToEnd(int data) {
        if (size() == capacity) {
            System.out.println("Queue overflow, delete unnecessary items");
            return;
        }

        tail++;
        // tail = (tail + 1) % capacity;
        arr[tail] = data;
        count++;
        System.out.println("Success: " + data + " added to the queue");
    }

//  Remove an element from the beginning of the queue and returns it. Reducing the size of the queue by one.
    public int removeFromHead() {
        if (isEmpty()) {
            System.out.println("No elements in queue");
            return -1;
        }

        int element = arr[head];
        moveQueue();
        count--;
        return element;
    }

    private void moveQueue() {
        for (int i = 1; i <= count; i++) {
            arr[i - 1] = arr[i];
        }
    }


//  Return an element at the beginning of the queue without deleting it. Returns element from queue.
    public int peekFromHead() {
        if (isEmpty()) {
            System.out.println("No elements in queue");
            return -1;
        }

        return arr[head];
    }

//  … и дополнительную операцию getMax(), которая должна возвращать максимальный элемент из SpecialQueue.
public int getMax(){
    if (isEmpty()) {
        System.out.println("No elements in queue");
        return -1;
    }
    int max = arr[0];
    for (int i = 1; i <= count; i++) {
        if (max < arr[i]){
            max = arr[i];
        }
    }
    return max;
}



//  Checks if queue is empty or not. Returns boolean.
    public boolean isEmpty() {
        return size() == 0;
    }

//  Return total number of elements present in the queue.  Returns current size of queue.
    public int size() {
        return count;
    }

    public void printQueue() {
        for (int i : arr) {
            System.out.print(i+",");
        }
        System.out.println();
    }

}

