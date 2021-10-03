/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution 28
 *  Copyright 2021 Michael Andrich
 */
//

package baseline;

import java.util.Scanner;

public class solution28 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        int input;
        // use a counted loop to prompt user for 5 numbers
        while(count < 6) {
            System.out.println("Enter a number:");
            input = sc.nextInt();
            // compute the total of the number
            sum +=input;
            count ++;
        }
            // print out total
        System.out.println("The total is "+sum+".");
    }
}
