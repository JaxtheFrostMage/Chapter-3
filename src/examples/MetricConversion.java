package examples;

import java.util.Scanner;

public class MetricConversion {

    public static void main(String[] args) {

        double x;

        System.out.println("What is the number to be converted?");
        Scanner inputScanner = new Scanner(System.in);
        x = inputScanner.nextInt();
inchesToCentimeters(x);
gallonsToLiters(x);

    }
    public static void inchesToCentimeters(double x){

        double convertedCentimeters;
        final double CENTIMETERS = 2.54;

        convertedCentimeters = x * CENTIMETERS;
        System.out.println(x + " inches turns to " + convertedCentimeters + " centimeters.");

    }
    public static void gallonsToLiters(double x){

        double convertedLiters;
        final double LITERS = 3.7854;

        convertedLiters = x * LITERS;
        System.out.println(x + " gallons turns to " + convertedLiters + " liter.");

    }

}
