/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution 24
 *  Copyright 2021 Michael Andirch
 */

package baseline;

import java.util.Scanner;

 class isAnagram{
        // use function isAnagram
        static boolean isAnagram(String str1, String str2);
        String s1= ...
        String s2 = ...
        // be sure to convert any uppercase/lowercase letters to one capitalization
        char[] ArrayS1 = s1.toLowerCase().toCharArray();
        char[] ArrayS2 = s2.toLowerCase().toCharArray();
        // create an if statement that returns true/false depending on the words
            if(s1 != s2){
            status = false;
                }
            else {

            }
            if(status){
            return true;
        }
            else {
            return false;
        }

}

public class solution24test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take in two inputs of strings from user


        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        // take in two words
        System.out.println("Enter the first string" );
        String str1 = sc.nextLine();

        System.out.println("Enter the second string" );
        String str2 = sc.nextLine();


        // create an if statement that returns true/false depending on the words
        if(s1 != s2){
            status = false;
        }
        else {

        }
        if(status){
            return true;
        }
        else {
            return false;
        }

        // print out whether the two words are anagrams or not
        if(isAnagram(str1, str2)){
            System.out.println("... are anagrams");
            else
                System.out.println("... are not anagrams");
        }

    }
}
