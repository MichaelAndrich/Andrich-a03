/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution 29
 *  Copyright 2021 Michael Andrich
 */

package baseline;

import java.util.Scanner;

public class solution29 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int input;
        while(true){
            // prompt user for input of question
            System.out.println("What is the rate of return? ");
            input = sc.nextInt();
            System.out.println(input);
            //print out amount of years to double investment
            if(input>=1 && input<= 72){
                System.out.println("It will take "+(72 / input)+ " years to double your investment. ");
                break;
                // dont allow for the input of 0s
            } else {
                //print out if 0 is inputted to re-enter new value
                System.out.println("0 is not a valid input. ");

            }
        }

    }

}