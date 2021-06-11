package Homework6;

public class Dog extends Animal{

    private static int maxDistanceRun = 500;
    private static int maxDistanceSwim = 10;
    private static int quantity = 0;

    public Dog(String name) {
        super(name, maxDistanceRun, maxDistanceSwim);
        quantity++;
    }

    public static int getQuantity() {
        return quantity;
    }

    public static void quantityInfo(){
        System.out.printf("Всего создано %s собак %n", quantity);
    }
}
