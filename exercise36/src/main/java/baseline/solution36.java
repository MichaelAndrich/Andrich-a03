/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution 36
 *  Copyright 2021 Michael Andrich
 */


package baseline;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

//import static java.util.Collections.max;
//import static java.util.Collections.min;


public class solution36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // similar to last exercise, we must store our inputted numbers into an arraylist
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        String input = null;
        do {
            System.out.println("Enter a number: ");
            input = sc.next();
            // similar to last exercise, create another loop that takes n amount of numbers
            // make sure to not read in the word done
            if (!input.equals("done")) {
                try {
                    int num = Integer.parseInt(input);
                    numbers.add(num);
                } catch (NumberFormatException nfe) {

                }

                System.out.println("Numbers: " +numbers.stream().map(String::valueOf).collect(Collectors.joining(",")));
                System.out.println("The average is: " + average(numbers));
                System.out.println("The minimum is: " + min(numbers));
                System.out.println("The maximum is: " + max(numbers));
                System.out.println("The standard deviation is: " + std(numbers));
            }
        }while (!input.equals("done"));
    }

                public static double average (ArrayList < Integer > numbers) {
                    // call array to get numbers and calc average
                    int total = 0;
                    for (int num : numbers) {
                        total += num;
                    }
                    double avg = (double) (total) / numbers.size();
                    return avg;
                }
                public static double min (ArrayList < Integer > numbers) {
                    // call array to get numbers and calc min
                    int min = numbers.get(0);
                    for (int num : numbers) {
                        if (num < min)
                            min = num;
                    }
                    return min;
                }
                public static double max (ArrayList < Integer > numbers) {
                    // call array to get numbers and calc max
                    int max = numbers.get(0);
                    for (int num : numbers) {
                        if (num > max)
                            max = num;
                    }
                    return max;
                }
                public static double std (ArrayList < Integer > numbers) {
                    // call array to get numbers and calc standard deviation
                    double mean = average(numbers);
                    double sum = 0;
                    for (int num : numbers) {
                        sum = sum + Math.pow((num - mean), 2);
                    }
                    double std = Math.sqrt(sum/numbers.size());
                    return std;
                }
            }


