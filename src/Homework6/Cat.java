package Homework6;

public class Cat extends Animal {

    private static int maxDistanceRun = 200;
    private static int maxDistanceSwim = 0;
    private static int quantity =0;

    public Cat(String name) {
        super(name, maxDistanceRun, maxDistanceSwim);
        quantity++;
    }

    public static int getQuantity() {
        return quantity;
    }
}

