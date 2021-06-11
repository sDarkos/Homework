package Homework7;

public abstract class Animal {

    private final String name;
    private final int appetite;
    private boolean satiety = false;

    public Animal(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {

        if(plate.getFood() < appetite){
            System.out.println("Foot is over");
        }else {
            plate.decreaseFood(appetite);
            satiety = true;
        }
    }

    public boolean getSatiety(){
        return satiety;
    }

    public void setSatiety(boolean satiety){
        this.satiety = satiety;
    }

    public int getAppetite(){
        return appetite;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", satiety=" + satiety +
                '}';
    }
}
