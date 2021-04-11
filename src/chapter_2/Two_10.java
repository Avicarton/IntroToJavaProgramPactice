package chapter_2;

import java.util.Scanner;

public class Two_10 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the amount of water in kilograms: ");
        double kilograms = in.nextDouble();
        System.out.println("Enter the initial temperature: ");
        double initial = in.nextDouble();
        System.out.println("Enter the final temperature: ");
        double finalt = in.nextDouble();
        System.out.println(String.format("The energy needed is %.2f",4184 * kilograms * (finalt - initial)));
    }
}
