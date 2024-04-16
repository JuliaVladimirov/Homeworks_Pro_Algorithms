package org.example.alg_homework_2024_04_15;

public class Activity {
    private String name;
    private int start;
    private int finish;
    private int price;

    public Activity(String name, int start, int finish, int price) {
        this.name = name;
        this.start = start;
        this.finish = finish;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getFinish() {
        return finish;
    }

    public void setFinish(int finish) {
        this.finish = finish;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
