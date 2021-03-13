package Chapter_2;

import java.util.Scanner;

public class Two_20 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = in.nextDouble();
        double rate = in.nextDouble();
        System.out.println(String.format("The interest is %.5f", balance * (rate / 1200)));
    }
}
