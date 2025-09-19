package com.xxxx.models.Order;

import com.xxxx.models.Burger.Burger;
import com.xxxx.models.Drink.Drink;
import com.xxxx.models.Drink.NoneDrink;
import com.xxxx.models.Pizza.Pizza;
import com.xxxx.models.Sub.Sub;
import com.xxxx.models.Topping.NoneTopping;
import com.xxxx.models.Topping.Topping;


public class Order {
    Pizza pizza;
    Burger burger;
    Sub sub;
    Topping topping;
    Drink drink;

    public Order() {
        this.pizza = new Pizza();
        this.burger = new Burger();
        this.sub = new Sub();
        this.topping = new NoneTopping();
        this.drink = new NoneDrink();
    }

    public Order(Pizza pizza, Burger burger, Sub sub, Topping topping, Drink drink) {
        this.pizza = pizza;
        this.burger = burger;
        this.sub = sub;
        this.topping = topping;
        this.drink = drink;
    }

    public int getTotalPriceInNumber() {
        return pizza.getPrice() + burger.getPrice() + sub.getPrice() + topping.getPrice() + drink.getPrice();
    }

    public String getTotalPriceInString() {
        return "The total order price is " + getTotalPriceInNumber();
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Burger getBurger() {
        return burger;
    }

    public void setBurger(Burger burger) {
        this.burger = burger;
    }

    public Sub getSub() {
        return sub;
    }

    public void setSub(Sub sub) {
        this.sub = sub;
    }

    public Topping getTopping() {
        return topping;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "Order{" +
                "pizza=" + pizza +
                ", burger=" + burger +
                ", sub=" + sub +
                ", topping=" + topping +
                ", drink=" + drink +
                '}';
    }
}
