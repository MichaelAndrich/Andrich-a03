/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution 30
 *  Copyright 2021 Michael Andrich
 */


package baseline;


public class solution30 {
    public static void main(String[] args) {
        //use for loops that create the rows in the table
        for (int row = 1; row <= 12; row++) {
            // nested for loop for columns
            for (int column = 1; column <= 12; column++){
                //print out v + h
                System.out.printf("%4d", row * column);
            }
            System.out.println();
        }
    }
}
