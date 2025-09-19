package com.xxxx.models.Pizza;

public class PizzaFactory {
    public static Pizza createPizza(String size) {
        switch (size) {
            case "s":
                return new SmallPizza();
            case "m":
                return new MediumPizza();
            case "l":
                return new LargePizza();
            default:
                return new Pizza();
        }
    }
}
