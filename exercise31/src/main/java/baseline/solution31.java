/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution 31
 *  Copyright 2021 Michael Andrich
 */


package baseline;

import java.util.Scanner;

public class solution31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // prompt user for age and resting heart rate
        // create our variables
        try {
            int intensity = 55;
            // only allow for use of numbers
            System.out.println("Enter your age: ");
            double age = sc.nextDouble();
            System.out.println("Enter your resting pulse: ");
            double restingHR = sc.nextDouble();
            System.out.println("Resting pulse: " + restingHR + "\tAge: " + age + "");


            System.out.println("Enter only numbers for your resting pulse.");

            // return if not entered with numbers
            System.out.println("Intensity   | Rate");
            // create break for table
            System.out.println("------------|----------");

            // calculations with
            while(intensity < 96){
                double TargetHeartRate = ((((220 - age) - restingHR) * intensity/100) + restingHR);
                System.out.println(+intensity+"          |"+TargetHeartRate+ "bpm");
                // use a loop to increment percentages from 55 to 95%
                intensity += 5;
            }
            intensity += 5;
        } catch (Exception e) {
            System.out.println("Enter only numbers. ");
        }
    }
}