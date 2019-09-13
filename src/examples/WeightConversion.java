package examples;

import java.util.Scanner;

public class WeightConversion {

    public static void main(String[] args){

        double pounds;

        Scanner input = new Scanner(System.in);

        System.out.println("How many pounds do you have?");
        pounds = input.nextDouble();

        calcToKilograms(pounds);
        calcToOunces(pounds);
        calcToMilligrams(pounds);

    }

    public static void calcToKilograms(double pounds){

        double kilograms;
        final double KILO_CONVERSION = 0.453592;

        kilograms = pounds * KILO_CONVERSION;

        System.out.println(pounds + " pounds is equal to " + kilograms + " Kilograms.");
    }

    public static void calcToOunces(double pounds){

        double ounces;
        final double OUNCE_CONVERSION = 16;

        ounces = pounds * OUNCE_CONVERSION;

        System.out.println(pounds + " pounds is equal to " + ounces + " Ounces.");
    }

    public static void calcToMilligrams(double pounds){

        double milligrams;
        final double MILLIGRAMS_CONVERSION = 453592;

        milligrams = pounds * MILLIGRAMS_CONVERSION;

        System.out.println(pounds + " pounds is equal to " + milligrams + " Milligrams.");
    }
}
