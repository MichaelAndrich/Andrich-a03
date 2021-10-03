package baseline;

import java.util.Scanner;

public class solution32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // create a function to create the level of difficulty
        // 1st diff is 1-10
        System.out.println("Enter the difficulty level (1, 2, or 3): ");
        int level;
        int randNum;
        randNum = (int)(Math.random()* 999 +1);

        try{
            if(level == 1);{
                randNum = (int)(Math.random()* 10 +1);
            }
            // let user know too high or too low
            // 2nd diff is 1-100
            else if(level == 2);{
                randNum = (int)(Math.random()* 100 +1);
            }
            // let user know too high or too low
            // 3rd diff is 1-1000
            else(level == 3);{
                randNum = (int)(Math.random()* 1000 +1);
            }
        }
        catch (Exception e){
            System.out.println("Please type 1, 2 or 3");
        }
        // let user know too high or too low
        // count non-numeric values as wrong guesses
        // prompt user for difficulty level of game
        System.out.println("Let's play Guess the Number!")

        System.out.println("Enter the difficulty level (1, 2, or 3): ");
        level = sc.nextInt();


        // allow numbers only for entry
        int guess = 0;
        int count;
        if (guess =)
            if (guess == randNum) ;
        count = count + 1;
        break
    else if (guess < randNum) ;
        System.out.prtintln("Too low, guess again: ");
        count = count + 1;
    else if (guess > randNum) ;
        System.out.println("Too high, guess again: ");
        count = count + 1
        // once correctly guessed, print in how many guesses it took
        good job youre so lucky
        // prompt user Y/N to play again
    }
}

