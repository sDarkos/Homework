package Homework6;

public class main {
    public static void main(String[] args) {

        Animal[] animalArray = {
                new Dog("Шарик"),
                new Cat("Мурзик"),
                new Cat("Барсик"),
                new Dog("Бобик"),
                new Dog("Рекс")
        };

        start(animalArray,  5000);
        animalQuantity(Dog.getQuantity(), Cat.getQuantity(), Animal.getQuantity());
    }

    static void animalQuantity (int dogs, int cats, int animals){
        System.out.printf("Создано животных - %s, из них:\nсобак - %s\nкотов - %s", animals, dogs, cats);
    }

    static void start(Animal[] animals, int distance){
        for (int i = 0; i <animals.length ; i++) {
            animals[i].run(distance);
            animals[i].swim(distance);
        }
    }
}
