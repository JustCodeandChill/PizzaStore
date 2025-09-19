package com.xxxx.models.Order;

import com.xxxx.models.Burger.Burger;
import com.xxxx.models.Drink.Drink;
import com.xxxx.models.Pizza.Pizza;
import com.xxxx.models.Sub.Sub;
import com.xxxx.models.Topping.Topping;

public class OrderBuilder {
    private Order order;

    private OrderBuilder() {
        order = new Order();
    }

    public static OrderBuilder createOrderBuilder() {
        return new OrderBuilder();
    }

    public OrderBuilder addPizza(Pizza pizza) {
        this.order.setPizza(pizza);
        return this;
    }

    public OrderBuilder addDrink(Drink drink) {
        this.order.setDrink(drink);
        return this;
    }

    public OrderBuilder addTopping(Topping topping) {
        this.order.setTopping(topping);
        return this;
    }

    public OrderBuilder addBurger(Burger burger) {
        this.order.setBurger(burger);
        return this;
    }

    public OrderBuilder addSub(Sub sub) {
        this.order.setSub(sub);
        return this;
    }

    public Order build() {
        return this.order;
    }

    public Order getOrder() {
        return this.order;
    }


}
