package Homework7;
import Homework7.Animal;

public class Plate {

    private static int food;

    public void addFood (int n){
        food += n;
    }

    public Plate (int food){
        this.food = food;
    }

    public int getFood(){
        return food;
    }

    public void decreaseFood(int n){
        food -= n;
    }

    public void setFood (int food){
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

}
