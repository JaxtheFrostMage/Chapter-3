package examples;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){

        int x;
        int y;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number.");
        x = input.nextInt();
        System.out.println("Enter your second number.");
        y = input.nextInt();

        calculatePlus(x, y);
        calculateSubtract(x, y);
        calculateMultiply(x, y);
        calculateDivide(x, y);
        calculateRemainder(x, y);
    }

    public static void calculatePlus(int x, int y){

        int total = x + y;
        System.out.println( x + " + " + y + " = " + total);
    }

    public static void calculateSubtract(int x, int y){

        int total = x - y;
        System.out.println( x + " - " + y + " = " + total);
    }

    public static void calculateMultiply(int x, int y){

        int total = x * y;
        System.out.println( x + " * " + y + " = " + total);
    }

    public static void calculateDivide(int x, int y){

        int total = x / y;
        System.out.println( x + " / " + y + " = " + total);
    }

    public static void calculateRemainder(int x, int y){

        int total = x % y;
        System.out.println( x + " % " + y + " = " + total);
    }

}
