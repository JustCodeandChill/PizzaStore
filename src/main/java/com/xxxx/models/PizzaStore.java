package com.xxxx.models;

import com.xxxx.models.Order.Order;

public class PizzaStore {
    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public PizzaStore() {
    }
}
