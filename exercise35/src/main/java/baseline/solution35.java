/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution 35
 *  Copyright 2021 Michael Andrich
 */

package baseline;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class solution35 {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);

        // like last exercise, use an array to store inputted names
        ArrayList<String> inputList = new ArrayList<String>();
        String input = null;

        // prompt user for names but in a loop
        do{
            System.out.println("Enter a name: ");
            input = sc.nextLine();

            // create if statement that will make sure no blanks are stored in array
            if (!input.isBlank() && !input.isEmpty())
                inputList.add(input);
        }
        // end do-while with a while statement
        while(!input.isBlank() && !input.isEmpty());

            // create a random generator for the winner

            Random random = new Random();
            int randomIndex = random.nextInt(inputList.size());

        // print out winner
        System.out.println("The winner is "+inputList.get(randomIndex));

    }
}
