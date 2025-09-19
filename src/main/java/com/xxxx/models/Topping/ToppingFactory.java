package com.xxxx.models.Topping;

public class ToppingFactory {
    public static Topping createTopping(String type) {
        switch (type) {
            case "b":
                return new BeefTopping();
            case "c":
                return new CheeseTopping();
            case "o":
                return new OnionTopping();
            default:
                return new NoneTopping();
        }
    }
}
