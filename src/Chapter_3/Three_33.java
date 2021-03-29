package chapter_3;

import java.util.Scanner;

public class Three_33 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter weight and price for package 1: ");
        double price1 = in.nextDouble()/in.nextDouble();
        System.out.print("Enter weight and price for package 2: ");
        double price2 = in.nextDouble()/in.nextDouble();
        System.out.println(String.format("%s",price1>=price2?price1==price2?"Two packages have the same price.":"Package 2 has the better price.":"Package 1 has the better price."));

    }
}
