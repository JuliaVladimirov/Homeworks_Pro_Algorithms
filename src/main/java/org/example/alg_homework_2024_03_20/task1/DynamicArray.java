package org.example.alg_homework_2024_03_20.task1;

public class DynamicArray {

    private int length;

    private int capacity;

    private int[] arr;

    public static final int DEFAULT_CAPACITY = 1;
    private final int PERCENT_CHANGE = 50;

    public DynamicArray() {
        this.arr = new int[DEFAULT_CAPACITY];
        this.capacity = DEFAULT_CAPACITY;
        this.length = DEFAULT_CAPACITY;
    }

    public DynamicArray(int capacity) {
        this.arr = new int[capacity];
        this.capacity = capacity;
        this.length = capacity;
    }

    public int[] getArr() {
        return arr;
    }

    public void fillInRow() {
        int inc = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inc;
            inc++;
        }
    }

    public void fillOdd() {
        int inc = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inc;
            inc +=2;
        }
    }

    public void fillEven() {
        int inc = 2;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inc;
            inc +=2;
        }
    }



//  создать метод добавления массива данных в конец нашего Динамического массива - addArray(int[] arrAdd)

    public void addArray(int[] arrAdd) {
        int[] arr1;

        if (length + arrAdd.length >= capacity) {
            arr1 = new int[capacity + arrAdd.length + (capacity * PERCENT_CHANGE / 100)];
        } else {
            arr1 = new int[capacity];
        }

        for (int i = 0; i < length; i++) {
            arr1[i] = arr[i];
        }
        for (int i = 0; i < arrAdd.length; i++) {
            arr1[length + i] = arrAdd[i];
        }
        arr = arr1;
        capacity = arr.length;
        length += arrAdd.length;
    }


//  ** создать метод добавления массива данных по индексу в наш Динамический массив - addAtArray(int index, int[] arrAdd)

    public void addAtArray(int index, int[] arrAdd) {
        int[] arr1;

        if (length + arrAdd.length >= capacity) {
            arr1 = new int[capacity + arrAdd.length + (capacity * PERCENT_CHANGE / 100)];
        } else {
            arr1 = new int[capacity];
        }

        for (int i = 0; i < index; i++) {
            arr1[i] = arr[i];
        }
        for (int i = 0; i < arrAdd.length; i++) {
            arr1[index + i] = arrAdd[i];
        }
        for (int i = 0; i < arr.length - index; i++) {
            arr1[index + arrAdd.length + i] = arr[index + i];
        }
        arr = arr1;
        capacity = arr.length;
        length += arrAdd.length;
    }


//  создать метод удаления элемента по его значению в нашем Динамическом массиве boolean removeValue(int value),
//  который возвращает true, если объект найден и удален, иначе false.

    public boolean removeValue(int value) {
        boolean result = false;
        int[] arr1 = new int[capacity - 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
                result = true;
            }
        }
        if(!result) return false;

        for (int i = 0; i < index; i++) {
            arr1[i] = arr[i];
        }
        for (int i = index + 1; i < capacity; i++) {
            arr1[i - 1] = arr[i];
        }
        arr = arr1;
        capacity = arr.length;
        length--;
        return true;
    }
}

