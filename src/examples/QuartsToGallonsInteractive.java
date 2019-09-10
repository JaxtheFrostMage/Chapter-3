package examples;

import java.util.Scanner;

public class QuartsToGallonsInteractive {

    public static void main (String[] args){

        int numQuarts;


        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter the number of quarts you have >>>> ");
        numQuarts = keyboard.nextInt();

       calculateToGallons(numQuarts);


    }
    public static void calculateToGallons(int numQuarts){

        int numGallons;
        int quartsRemainig;
        final int NUM_QUARTS_IN_GALLON = 4;

        numGallons = numQuarts / NUM_QUARTS_IN_GALLON;

        quartsRemainig = numQuarts % NUM_QUARTS_IN_GALLON;
        System.out.println("The number of gallons " + numGallons + " With " +
                quartsRemainig + " Quarts Remaining");
    }
}
