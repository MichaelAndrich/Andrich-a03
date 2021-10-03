/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution 33
 *  Copyright 2021 Michael Andrich
 */



package baseline;

import java.util.Scanner;
import java.util.Random;

public class solution33 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // prompt user for question
        System.out.println("What is your question? ");
        String input = sc.nextLine();
        Random random = new Random();

        // store in possible answers such as yes, no, maybe and ask again later
        String [] possible = {"Yes", "No", "Maybe", "Ask again later"};
        // randomly choose one of those responses
        int randomResponse = random.nextInt(possible.length);
        String response = possible[randomResponse];

        // prtint out the magic answer
        System.out.println(""+response+"");

    }
}
