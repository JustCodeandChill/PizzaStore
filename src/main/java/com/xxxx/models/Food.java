package com.xxxx.models;

public abstract class Food {
    private String name;
    private int price;

    public Food() {
        this.name = "";
        this.price = 0;
    }

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
