/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution 27
 *  Copyright 2021 Michael Andrich
 */

package baseline;


            // 1st function for validating first name
        validFirst();
            if(input.length < 2)
        {
            System.out.println("The first name must be at least 2 characters long. ")
        }
            // 2nd function for validating last name and to have a last name
        validLast();
        if(input.length < 0)
        {
        System.out.println("The last name must be filled in. ")
        } if else (input.length < 2) {
        System.out.println("The first name must be at least 2 characters long. ")
        }
            // 3rd function to validate zip code
        validZip();
        if(input.length < 2)
        {
        System.out.println("The first name must be at least 2 characters long. ")
        }
            // 4th function to validate employee ID
        validEmployee();
        for (int i = 0; i < n; i++){
            if(input.length(i) >= '0' && input.length(i) <= '9'){
                return true;
        }
            else {
                return false;
        }
        }
        return false;




public class solution27 {
    public static void main(String args[])
    {
        // read in 1st name
        // read in last name
        // read in zip code
        // read in employee id
        //return any errors found, if none, then return no errors
    }
}
