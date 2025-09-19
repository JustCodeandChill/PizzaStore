package com.xxxx.models.Topping;

import com.xxxx.models.Food;

public abstract class Topping extends Food {
    public Topping() {
        this("", 0);
    }

    public Topping(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Topping{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
