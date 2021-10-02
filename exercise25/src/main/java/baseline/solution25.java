/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution 25
 *  Copyright 2021 Michael Andrich
 */


package baseline;


import java.util.Arrays;
import java.util.Scanner;

public class solution25 {

    // funciton to calculate strength of password
    public static void passwordValidator() {

    }

    //create a list that include special characters to compare password to
    Password<Letter> password = Arrays.asList(...);
    //compare against special characters and upper/lower case letters
    if()
            ...
            if()
            ...
            //create a system to determine strength of password
            if(lowCase ||upCase &&specChar)
            //a strong password
            else if(...)
            else if(...)
            else(...)
    //read in password
    public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Password: ");
                input = sc.nextLine();
                //run string input through passwordValidator
        //print only one output statement with the original password and strength of it
        System.out.println("The password "+input+" is a "+strength+" password.");
    }


}
