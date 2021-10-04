/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution 37
 *  Copyright 2021 Michael Andrich
 */


//ABCDEFGHIJKLMNOPQRSTUVWXYZ
//abcdefghijklmnopqrstuvwxyz

package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class solution37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // prompt user for the minimum length of password
        System.out.println("What's the minimum length? ");
        // prompt user for how many special characters
        System.out.println("How many special characters? ");
        // prompt user for how many numbers
        System.out.println("How many numbers? ");
        // print out randomly generated password
        System.out.println("Your password is "+randomPassword);


        public static String randomPassword(int length, int spec, int nums){

            String ABCDEFGHIJKLMNOPQRSTUVWXYZ;
            String a1 = ABCDEFGHIJKLMNOPQRSTUVWXYZ;
            String abcdefghijklmnopqrstuvwxyz;
            String a2 = abcdefghijklmnopqrstuvwxyz;



        // create a list for the alphabet a-z and A-Z
        List<String> alphabet = new ArrayList<String>();
        alphabet.add(a1);
        alphabet.add(a2);

        String special = "!@#$%^&*()<>?:+=";

        // create a list for special characters
        List<String> specCharacters = new ArrayList<String>();
        specCharacters.add(special);

        String numb = "1234567890";

        // create a list for numbers
        List<String> numbers = new ArrayList<String>();
        numbers.add(numb);

        Random random = new Random();



        // create a loop to generate a random set of determined special characters
        for(int i = 0; i<spec; i++){
            chars.add(specCharacters.charAt(random.nextInt(letters.length)));
            }
        // create a loop to generate a random set of determined numbers
            for(int i = 0; i < nums; i++){
                chars.add(letters.charAt(random.nextInt(letters.length)));
            }
        // create a loop to generate a random set of letters to fill the rest with the password
                for(int i = chars.size()-1; i < length; i++){
                    chars.add(letters.charAt(random.nextInt(letters.length)));
                }
        // create a loop to generate a random set of all obtained special characters, numbers and letters
                    for()


        }
    }
}
