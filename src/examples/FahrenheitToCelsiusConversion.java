package examples;

import java.util.Scanner;

public class FahrenheitToCelsiusConversion {

    public static void main(String[] args){

        double tempAt8am;
        double tempAt12am;
        double tempAt5pm;
        int pick = 0;

        System.out.println("What was the temperature at 8:00 AM?");
        Scanner inputScanner = new Scanner(System.in);
        tempAt8am = inputScanner.nextDouble();
        System.out.println("What was the temperature at 12:00 AM?");
        inputScanner = new Scanner(System.in);
        tempAt12am = inputScanner.nextDouble();
        System.out.println("What was the temperature at 5:00 PM?");
        inputScanner = new Scanner(System.in);
        tempAt5pm = inputScanner.nextDouble();

        fahrenheitToCelsius(tempAt8am, tempAt12am, tempAt5pm);
    }

    public static void fahrenheitToCelsius(double tempAt8am, double tempAt12am, double tempAt5pm){

        double conversion8;
        double conversion12;
        double conversion5;

        conversion8 = (tempAt8am - 32) * 5 / 9;
        conversion12 = (tempAt12am - 32) * 5 / 9;
        conversion5 = (tempAt5pm - 32) * 5 / 9;

        System.out.println(tempAt8am + " Fahrenheit is equivalent to " + conversion8 + " Celsius");
        if(tempAt8am < 32){
            System.out.println("That's Cold!");
        }else if(tempAt8am > 100){
            System.out.println("That's Hot!");
        }
        System.out.println(tempAt12am + " Fahrenheit is equivalent to " + conversion12 + " Celsius");
        if(tempAt12am < 32){
            System.out.println("That's Cold!");
        }else if(tempAt12am > 100){
            System.out.println("That's Hot!");
        }
        System.out.println(tempAt5pm + " Fahrenheit is equivalent to " + conversion5 + " Celsius");
        if(tempAt5pm < 32){
            System.out.println("That's Cold!");
        }else if(tempAt5pm > 100){
            System.out.println("That's Hot!");
        }


    }

}
