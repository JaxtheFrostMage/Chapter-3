package examples;

import java.util.Scanner;

public class PaintCalculator {

    public static void main(String[] args)
    {
        double heightOfWall;
        double lengthOfWall;
        double widthOfWall;

        Scanner inputDevice = new Scanner(System.in);

        System.out.println("What is the height of your walls?");
        heightOfWall = inputDevice.nextInt();
        System.out.println("What is the length of your walls?");
        lengthOfWall = inputDevice.nextInt();
        System.out.println("What is the width of your walls?");
        widthOfWall = inputDevice.nextInt();

        wallArea(heightOfWall, lengthOfWall, widthOfWall);
    }

    public static void wallArea(double heightOfWall, double lengthOfWall, double widthOfWall)
    {
        double areaOfFrontAndBackWalls;
        double areaOfSideWalls;
        double totalArea;

        areaOfFrontAndBackWalls = heightOfWall * lengthOfWall * 2;
        areaOfSideWalls = heightOfWall * widthOfWall * 2;
        totalArea = areaOfFrontAndBackWalls + areaOfSideWalls;

        System.out.println("Your total area needed to be painted is " + totalArea + ".");

        numGallons(totalArea);
    }

    public static void numGallons(double totalArea)
    {
        double gallonsNeeded;
        final double FEET_COVERED_BY_GALLON = 350;

        gallonsNeeded = totalArea / FEET_COVERED_BY_GALLON;
        Math.ceil(gallonsNeeded);

        System.out.println("That means that you will need " + gallonsNeeded + " gallons For the paint job.");

        totalCostOfGallons(gallonsNeeded);
    }

    public static void totalCostOfGallons(double gallonsNeeded)
    {
        double finalCost;
        final double COST_OF_GALLONS = 32;

        finalCost = gallonsNeeded * COST_OF_GALLONS;

        System.out.println("This brings your total cost for paint to be " + finalCost + ".");
    }
}
