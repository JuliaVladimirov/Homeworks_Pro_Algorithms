package org.example.lesson_2024_04_22.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Backpack {
    int backpackCapacity;

    public Backpack(int backpackCapacity) {
        this.backpackCapacity = backpackCapacity;
    }

    public void fillBackpack(List<Item> list) {

        list.sort((o1, o2) -> o2.getPrice() / o2.getWeight() - o1.getPrice() / o1.getWeight());
        List<Item> backpackFull = new ArrayList<>();
        print(list);
        System.out.println("--------------------");


        int freeCapacity = backpackCapacity;
        int totalPrice = 0;
        for (int i = 0; i < list.size(); i++) {
            if (freeCapacity > list.get(i).getWeight()) {
                backpackFull.add(list.get(i));
                freeCapacity = freeCapacity - list.get(i).getWeight();
                totalPrice = totalPrice + list.get(i).getPrice();
            } else {
                int addPrice = list.get(i).getPrice() / list.get(i).getWeight() * freeCapacity;

                backpackFull.add(new Item (freeCapacity,addPrice));
                totalPrice = totalPrice + addPrice;
            }

        }

        print(backpackFull);
        System.out.println("Total price: " + totalPrice);
    }

    private void print(List<Item> list) {
        for (Item item : list) {
            System.out.println(item.getWeight() + "  " + item.getPrice());
        }
    }
}
