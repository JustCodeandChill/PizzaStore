package com.xxxx.models.Burger;

public class BurgerFactory {
    public static Burger createBurger(String size) {
        switch (size) {
            case "s":
                return new SmallBurger();
            case "l":
                return new LargeBurger();
            default:
                return new Burger();
        }
    }
}
