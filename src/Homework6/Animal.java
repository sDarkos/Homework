package Homework6;

public class Animal {
    private String name;
    private int maxDistanceRun;
    private int maxDistanceSwim;
    private static int quantity;

    public void run(int distance) {
        if (distance < 0) {
            System.out.println("Увы, но пока что у наших животных нет возможности бегать назад :(");
        } else {
            if  (distance > maxDistanceRun) {
                distance = maxDistanceRun;
            }
            System.out.printf("%s пробежал %s метров %n", getName(), distance);
        }
    }

    public void swim(int distance) {
        if (distance < 0){
            System.out.println("Увы, но пока что у наших животных нет возможности плавать назад :(");
            System.out.println();
        } else {
            if (maxDistanceSwim == 0) {
                System.out.printf("%s утонул :(%n", getName()); // ну а что вы хотели? Не умеешь плавать, значит тонешь :(
            } else {
                if (distance > maxDistanceSwim) {
                    distance = maxDistanceSwim;
                }
                System.out.printf("%s проплыл %s метров %n", getName(), distance);
            }
            System.out.println();
        }
    }

    public Animal(String name, int maxDistanceRun, int maxDistanceSwim) {
        this.name = name;
        this.maxDistanceRun = maxDistanceRun;
        this.maxDistanceSwim = maxDistanceSwim;
        quantity++;
    }

    public String getName() {
        return name;
    }

    public static int getQuantity() {
        return quantity;
    }
}
