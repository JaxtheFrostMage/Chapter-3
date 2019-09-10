package examples;

import java.util.Scanner;

public class FahrenheitToCelsiusConversion {

    public static void main(String[] args){

        int tempAt8am;
        int tempAt12am;
        int tempAt5pm;

        System.out.println("What was the temperature at 8:00 AM?");
        Scanner inputScanner = new Scanner(System.in);
        tempAt8am = inputScanner.nextInt();
        System.out.println("What was the temperature at 12:00 AM?");
        inputScanner = new Scanner(System.in);
        tempAt12am = inputScanner.nextInt();
        System.out.println("What was the temperature at 5:00 PM?");
        inputScanner = new Scanner(System.in);
        tempAt5pm = inputScanner.nextInt();


    }
    public static void temperatureConversion(int tempAt8am, int tempAt12am, int tempAt5pm){


    }
}
