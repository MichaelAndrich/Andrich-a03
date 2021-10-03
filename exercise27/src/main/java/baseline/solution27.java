/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution 27
 *  Copyright 2021 Michael Andrich
 */

package baseline;

import java.util.regex.Pattern;
import java.util.Scanner;


public class solution27 {
    // 1st function for validating first name
    public static void validFirst(String first) {
        if (first.equals("")) {
            a1.append("The first name must be filled in. ");
        } else if (first.length() < 2) {
            a1.append("The first name must be at least 2 characters long. ");
        }
    }

    // 2nd function for validating last name and to have a last name
    public static void validLast(String last) {

        if (last.equals("")) {
            System.out.println("The last name must be filled in. ");
        } else if (last.length() < 2) {
            System.out.println("The last name must be at least 2 characters long. ");
        }
    }

    // 3rd function to validate zip code
    public static void validZip(String zip) {
        if (Pattern.matches("[0-9](5)", zip)) {
        } else {
            System.out.println("The zip code must be a 5 digit number. ");
        }
    }

    // 4th function to validate employee ID
    public static void validEmployee(String employee) {
        if (Pattern.matches("[a-zA-Z](2)- [0-9](4)", employee)) {

        } else {
            System.out.println("The employee ID must be in the format of AA-1234");
        }
    }

public static void validateInput() {

        }





    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // read in 1st name
        System.out.println("Enter the first name: ");
        String first = sc.nextLine();
        // read in last name
        System.out.println("Enter the last name: ");
        String last = sc.nextLine();
        // read in zip code
        System.out.println("Enter the ZIP code: ");
        String zip = sc.nextLine();
        // read in employee id
        System.out.println("Enter the employee ID: ");
        String employee = sc.nextLine();
        //return any errors found, if none, then return no errors

        //System.out.println("");
    }
}
