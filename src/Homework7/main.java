package Homework7;

public class main {
    public static void main(String[] args) {

    Animal [] animals = {
            new Cat("Барсик", 10),
            new Cat("Барсик", 15),
            new Dog("Шарик", 30),
            new Cat("Барсик", 18),
            new Cat("Барсик", 15),
            new Dog("Шарик", 30)
        };

    Plate plate = new Plate(100);

    goEat(animals, plate);

    plate.addFood(200);

    System.out.println("add food in plate + 200:" + plate.getFood());

    }

    public static void goEat(Animal[] animals, Plate plate){
        for (int i = 0; i < animals.length ; i++) {
            animals[i].eat(plate);
            System.out.println(animals[i]);
        }
        System.out.println("Food in plate: " + plate.getFood());
    }
}
