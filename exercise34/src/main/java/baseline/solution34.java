/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution 34
 *  Copyright 2021 Michael Andrich
 */


package baseline;


import java.util.Arrays;
import java.util.Scanner;

public class solution34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // use an array to store in the existing employees
        Array employees =
                (Arrays.asList("John Smith", ));

        // print out original list of 5 people
        System.out.println("" + employees);

        // read in name to remove from list
        System.out.println("Enter an employee name to remove: ");
        String removeEmployee = sc.nextLine();

        // read in the name through the array to remove it from the array
        employees.remove(removeEmployee);
        // print out the remaining number of employees

        // print out new list of employees with removed name
        System.out.println("");



    }

 }