import java.util.Random;
import java.util.Scanner;

public class Game {

    static final char empty_map = '-';

    public static void start(){

        System.out.println("Добро пожаловать в игру Крестики- Нолики!");

        char[][] map = generateMap();

        printMap(map);
        do {
            playerMove(map);
            printMap(map);
             if (isWin(map, 'X')){
                 System.out.println("Поздравляю, вы победили!");
                 break;
             } else if(isDraw(map)){
                 System.out.println("Ничья!");
                 break;
             }
            botMove(map, 'X');
            printMap(map);
            if (isWin(map, 'O')){
                System.out.println("К сожалению вы проиграли.");
                break;
            }else if(isDraw(map)) {
                System.out.println("Ничья!");
                break;
            }
            } while (true);
    }

    static char[][] generateMap(){
        int size = 0;
        do {
            System.out.println("на каком поле вы хотите сыграть? (Выбирете вариант)\n1) 3 x 3 \n2) 5 x 5");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            if (answer == 1) {
                size = 3;
            } else if (answer == 2) {
                size = 5;
            } else {
                System.out.println("Вы ввели число не правильно!");
            }
        }
            while (size == 0) ;

            char[][] map = new char[size][size];
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    map[i][j] = empty_map;
                }
            }
            return map;
        }

    static boolean isDraw(char[][] map) {
        for (int v = 0; v < map.length; v++) {
            for (int h = 0; h < map.length; h++) {
                if (isEmpty(map, v, h)) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isWin(char[][] map, char sign){

        boolean chVert = chVert(map, sign);
        boolean chHor = chHor(map, sign);
        boolean chLR = chLR(map, sign);
        boolean chRL = chRL(map, sign);

        if(chHor || chLR || chRL || chVert){
            return true;
        }
        return false;
    }

    static boolean chRL(char[][] map, char sign){
        boolean chWin = true;
        int j = map.length -1;

        for (int i = 0; i < map.length ; i++) {
            chWin = chWin & (map[i][j] == sign);
            j--;
        }
        if (chWin){
            return true;
        }
        return false;
    }

    static boolean chLR(char[][] map, char sign){
        boolean chWin = true;

        for (int i = 0; i < map.length ; i++) {
                chWin = chWin & (map[i][i] == sign);
        }
        if (chWin){
            return true;
        }
        return false;
    }

    static boolean chHor(char[][] map, char sign){
        boolean chWin;

        for (int i = 0; i < map.length ; i++) {
            chWin = true;
            for(int j = 0; j < map[i].length; j++){
                chWin = chWin & (map[i][j] == sign);
            }
            if (chWin){
                return true;
            }
        }
        return false;
    }

    static boolean chVert(char[][] map, char sign){
        boolean chWin;

        for (int i = 0; i < map.length ; i++) {
            chWin = true;
            for(int j = 0; j < map[i].length; j++){
                chWin = chWin & (map[j][i] == sign);
            }
            if (chWin){
                return true;
            }
        }
        return false;
    }

    static void printMap(char[][] map){
        for(int i = 0; i < map.length; i++){
            for (int j = 0; j < map[i].length; j++){
                System.out.print(" " + map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void botMove(char[][] map, char sign){

        if(!botAnalRL(map,sign) && !botAnalLR(map,sign) && !botAnalHor(map,sign) && !botAnalVert(map,sign) ) {
            Random random = new Random();
            int v, h;
            do {
                v = random.nextInt(3);
                h = random.nextInt(3);
            } while (isNotEmpty(map, v, h));

            map[v][h] = 'O';
        }
    }

    static boolean botAnalHor(char[][] map, char sign){
        int score = 0;
        for (int i = 0; i < map.length; i++) {
            score = 0;
            for (int j = 0; j < map[i].length; j++) {
                if(map[i][j] == sign){
                    score++;
                }
            } if(score == map.length - 1){
                for (int j = 0; j < map[i].length ; j++) {
                    if (map[i][j] == empty_map){
                        map[i][j] = 'O';
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static boolean botAnalVert(char[][] map, char sign){
        int score = 0;
        for (int i = 0; i < map.length; i++) {
            score = 0;
            for (int j = 0; j < map[i].length; j++) {
                if(map[j][i] == sign){
                    score++;
                }
            } if(score == map.length - 1){
                for (int j = 0; j < map[i].length ; j++) {
                    if (map[j][i] == empty_map){
                        map[j][i] = 'O';
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static boolean botAnalRL(char[][] map, char sign){
        boolean chWin = true;
        int j = map.length -1;
        int score =0;

        for (int i = 0; i < map.length ; i++) {
            if (map[i][j] == sign){
                score++;
            }
            j--;
        }
        if (score == map.length -1){
            j = map.length -1;
            for (int i = 0; i < map.length ; i++) {
                if (map[i][j] == empty_map){
                    map[i][j] = 'O';
                    return true;
                }
                j--;
            }
        }
        return false;
    }

    static boolean botAnalLR(char[][] map, char sign){
        boolean chWin = true;
        int score =0;

        for (int i = 0; i < map.length ; i++) {
            if (map[i][i] == sign){
                score++;
            }
        }
        if (score == map.length -1){
            for (int i = 0; i < map.length ; i++) {
                if (map[i][i] == empty_map){
                    map[i][i] = 'O';
                    return true;
                }
            }
        }
        return false;
    }

    static void playerMove(char[][] map){
        int v, h;
        do{
            v = getCoordinate(map, "вертикальную");
            h = getCoordinate(map, "горизонтальную");
        } while (isNotEmpty(map, v, h));
        map[v][h] = 'X';
    }

    static int getCoordinate(char[][] map, String coordinateName) {
        Scanner scanner = new Scanner(System.in);
        int coordinate;
        do {
            System.out.printf("Пжалуйста, введите  %s координату  от 1 до 3. %n", coordinateName);
            coordinate = scanner.nextInt() - 1;
        } while (coordinate < 0 || coordinate >= map.length);

        return coordinate;
    }

    static boolean isEmpty(char[][] map, int v, int h) {
        return map[v][h] == empty_map;
    }

    static boolean isNotEmpty(char[][] map, int v, int h) {
        // if isEmptyCell -> false -> conversion !false ->  true
        return !isEmpty(map, v, h);
    }
}
