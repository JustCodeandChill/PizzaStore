package com.xxxx.models.Drink;

public class DrinkFactory {
    public static Drink createDrink(String type) {
        switch (type) {
            case "c":
                return new Coke();
            case "d":
                return new DrPepper();
            case "w":
                return new Water();
            default:
                return new NoneDrink();
        }
    }
}
