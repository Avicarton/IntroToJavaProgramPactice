package chapter_2;

import java.util.Scanner;

public class Two_23 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the driving distance: ");
        double distance = in.nextDouble();
        System.out.println("Enter miles per gallon: ");
        double miles = in.nextDouble();
        System.out.println("Enter price per gallon: ");
        double price = in.nextDouble();
        System.out.println(String.format("The cost of driving is $%.2f",distance / miles * price));
    }
}
