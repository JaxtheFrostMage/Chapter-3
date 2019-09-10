package examples;

public class NumbersDemo {
    public static void main(String[] args){

        int x = 5;
        int y = 10;
        displayTwiceTheNumber(x, y);
        displayNumberPlusFive(x, y);
displayNumberSquared(x, y);
    }

    public static void displayTwiceTheNumber(int x, int y){

        int x2;
        int y2;

        x2 = x * 2;
        y2 = y * 2;
        System.out.println(x2 + " " + y2);
    }

    public static void displayNumberPlusFive(int x, int y){

        int x5;
        int y5;

        x5 = x + 5;
        y5 = y + 5;
        System.out.println(x5 + " " + y5);
    }

    public static void displayNumberSquared(int x, int y){

        int xSquared;
        int ySquared;

        xSquared = x * x;
        ySquared = y * y;
        System.out.println(xSquared + " " + ySquared);
    }
}
