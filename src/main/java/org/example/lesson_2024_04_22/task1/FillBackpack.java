package org.example.lesson_2024_04_22.task1;

import java.util.ArrayList;
import java.util.List;

public class FillBackpack {
    public static void main(String[] args) {
        Item item1 = new Item(10, 60);
        Item item2 = new Item(20, 100);
        Item item3 = new Item(30, 120);

        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);


        Backpack backpack = new Backpack(50);
        backpack.fillBackpack(itemList);
    }
}
