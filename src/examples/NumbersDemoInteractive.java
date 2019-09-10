package examples;

import java.util.Scanner;

public class NumbersDemoInteractive {
        public static void main(String[] args){

    int x;
    int y;


            System.out.println("What is your first Value?");
            Scanner inputScanner = new Scanner(System.in);
            x = inputScanner.nextInt();
            System.out.println("What is your second Value?");
            inputScanner = new Scanner(System.in);
            y = inputScanner.nextInt();
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
