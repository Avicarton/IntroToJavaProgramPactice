package chapter_3;

import java.util.Scanner;

public class Three_7 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print(
                "Enter an amount in int, for example 1156: ");
        int amount = input.nextInt();

        //int remainingAmount = (int)(amount * 100);
        int remainingAmount = amount;
        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        // Display results
        if (numberOfOneDollars > 0) {
            System.out.print(numberOfOneDollars + " dollar");
            if(numberOfOneDollars>1)
                System.out.print("s");
            System.out.print(" and ");
        }
        if (numberOfQuarters > 0) {
            System.out.print(numberOfQuarters + " quarter");
            if(numberOfQuarters>1)
                System.out.print("s");
            System.out.print(" and ");
        }
        if (numberOfDimes > 0) {
            System.out.print(numberOfDimes + " dime");
            if(numberOfDimes>1)
                System.out.print("s");
            System.out.print(" and ");
        }
        if (numberOfNickels > 0) {
            System.out.print(numberOfNickels + " nickel");
            if(numberOfNickels>1)
                System.out.print("s");
            System.out.print(" and ");
        }
        if (numberOfPennies > 0) {
            System.out.print(numberOfPennies + " pennie");
            if(numberOfPennies>1)
                System.out.print("s");
        }


    }
}
