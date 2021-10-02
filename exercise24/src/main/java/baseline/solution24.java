/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution 24
 *  Copyright 2021 Michael Andrich
 */
//done
package baseline;

import java.util.Arrays;
import java.util.Scanner;

class AnagramCheck{
    // use function isAnagram
    static boolean isAnagram(String str1, String str2){
        String s1= str1.replaceAll("\\s", "");
        String s2= str2.replaceAll("\\s", "");
        boolean status = true;
        // create an if statement that returns true/false depending on the word choice
        if(s1.length() != s2.length()){
            status = false;
        } else {
            // be sure to convert any uppercase/lowercase letters to one capitalization
            char[] ArrayString1 = s1.toLowerCase().toCharArray();
            char[] ArrayString2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayString1);
            Arrays.sort(ArrayString2);
            status = Arrays.equals(ArrayString1, ArrayString2);
        }
        return status;
    }

public static class solution24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take in two inputs of strings from user
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        // take in two words
        System.out.println("Enter the first string" );
        String str1 = sc.nextLine();

        System.out.println("Enter the second string" );
        String str2 = sc.nextLine();
        // call isAnagram function
        if(isAnagram(str1, str2))
            System.out.println(""+str1+" and " +str2+ " are anagrams.");
        else
            System.out.println(""+str1+" and " +str2+ " are not anagrams.");

        }

    }
}
