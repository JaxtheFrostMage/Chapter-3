package examples;

import java.util.Scanner;

public class DemoRaise {

    public static void main(String[] args){

    double salary;
    System.out.println("What is your Salary?");

        Scanner inputDevice = new Scanner(System.in);
        salary = inputDevice.nextInt();

    predictRaise(salary);

    }
    public static void predictRaise(double salary){

        double newSalary;
        final double RAISE_RATE = 1.10;
        newSalary = salary * RAISE_RATE;

        System.out.println("Currect salary: " + salary + "\nAfter raise: " +
        newSalary);

    }
}
