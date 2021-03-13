package Chapter_2;

import java.util.Scanner;

public class Two_21 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter investment amount: ");
        double investment = in.nextDouble();
        System.out.println("Enter annual interest rate in percentage: ");
        double rate = in.nextDouble();
        System.out.println("Enter number of year: ");
        double year = in.nextDouble();
        System.out.println(String.format("Future value is $%.2f",investment * Math.pow((1 + rate / 1200), 12 * year)));
    }
}
