package baseline;

import java.util.Scanner;

class PaymentCalculator {
    public void calculateMonthsUntilPaidOff {

        // n = months
        // (i /100) / 365 = daily rate (APR divided by 365)
        // b = balance
        // p = monthly payment
        // n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)

    }

}
public class solution26 {
    public static void main(String[] args) {

        //read in balance
        System.out.println("What is your balance? ");
        //read in apr as a percent and convert
        System.out.println("What is the APR on the card (as a percent)? ");
        // read in monthly payment
        System.out.println("What is the monthly payment you can make? ");
        //print out how many months it will take
        System.out.println("It will take you " + months + " to pay off this card.");
    }
}