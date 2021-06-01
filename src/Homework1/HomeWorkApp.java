import java.net.SocketOption;

public class HomeWorkApp {

    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    static public void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static public void checkSumSign() {
        int a = 321;
        int b = 321;

        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else
            System.out.println("Сумма отрицательная");
    }

    static public void printColor() {
        int value = -34;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else
            System.out.println("Зеленый");
    }

    static public void compareNumbers() {
        int a = 10;
        int b = 7;

        if (a >= b){
            System.out.println("a <= b");
        } else
            System.out.println("b < a");
    }

}
