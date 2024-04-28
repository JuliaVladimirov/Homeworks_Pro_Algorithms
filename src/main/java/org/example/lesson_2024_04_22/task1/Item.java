package org.example.lesson_2024_04_22.task1;

public class Item {

    private int weight;
    private int price;
    private int part;


    public Item(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPart() {
        return part;
    }
    public void setPart(int part) {
        this.part = part;
    }


    @Override
    public String toString() {
        return "Item{" +
                "weight=" + weight +
                ", price=" + price +
                ", part=" + part +
                '}';
    }
}
