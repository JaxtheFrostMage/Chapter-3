package examples;

import java.util.Scanner;

public class percentages {

    public static void main(String[] args){

        double x;
        double y;

        System.out.println("What is your first Value?");
        Scanner inputScanner = new Scanner(System.in);
        x = inputScanner.nextInt();
        System.out.println("What is your second Value?");
        inputScanner = new Scanner(System.in);
        y = inputScanner.nextInt();

        computePercent(x, y);
    }
    public static void computePercent(double x, double y){

        double xToYPercent;
        double yToXPercent;

        xToYPercent = x / y;
        System.out.println(x + " is " + xToYPercent + " percent of " + y);
        yToXPercent = y / x;
        System.out.println(y + " is " + yToXPercent + " percent of " + x);
    }
}
