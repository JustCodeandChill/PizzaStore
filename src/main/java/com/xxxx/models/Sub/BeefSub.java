package com.xxxx.models.Sub;

public class BeefSub extends Sub{
    public BeefSub() {
        super("beef sub", 6);
    }

    public static class SubFactory {
        public static Sub createSub(String type) {
            switch (type) {
                case "b":
                    return new BeefSub();
                case "c":
                    return new ChickenSub();
                case "v":
                    return new VeggieSub();
                default:
                    return new Sub();
            }
        }
    }
}
