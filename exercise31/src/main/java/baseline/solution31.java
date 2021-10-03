/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution 31
 *  Copyright 2021 Michael Andrich
 */


package baseline;

import java.util.Scanner;

public class solution31 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        // prompt user for age and resting heart rate
        // create our variables
        double restingHR;
        double age;
        int intensity = 55;
        // only allow for use of numbers
        if (!restingHR.matches ["0-9"]);{

        } else {
            ...
        }
        if (!age.matches ["0-9"]);{

        } else {
            ...
        }
        // return if not entered with numbers

        // calculations with
        TargetHeartRate = (((220 - age) - restingHR) * intensity) + restingHR;
        // display using a tabular format
        System.out.println("Intensity | Rate");
        // create break for table
        System.out.println("-----------------");
        // print out intensity % / rate bpm
        // use a loop to increment percentages from 55 to 95%
        intensity += 5;
    }
}
