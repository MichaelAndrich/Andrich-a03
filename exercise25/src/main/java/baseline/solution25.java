/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution 25
 *  Copyright 2021 Michael Andrich
 */


package baseline;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class solution25 {


    // funciton to calculate strength of password
    public static void passwordValidator(String input) {
        int n = input.length();
        boolean lowCase = false, upCase = false, hasNum = false, specChar = false;
        //create a list that include special characters to compare password to
        List<Character> list = new HashList<Character>(Arrays.asList('<', '>', '?', ';', ':', '|',
                ']', '{', '}', '`', '~', '!', '@', '#', '$', '%', '^', '&',
                '*', '(', ')', '-', '='));
        for (char i : input.toCharArray()) {
            //compare against special characters and upper/lower case letters
            if (Character.isLowerCase(i))
                lowCase = true;
            if (Character.isUpperCase(i))
                upCase = true;
            if (Character.isDigit(i))
                hasNum = true;
            if (list.contains(i))
                specChar = true;
        }


        //read in password
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Password: ");
            input = sc.nextLine();
            //run string input through passwordValidator
            //print only one output statement with the original password and strength of it
            System.out.println("The password " + input + " is a " + strength + " password.");
        }


    }
}
