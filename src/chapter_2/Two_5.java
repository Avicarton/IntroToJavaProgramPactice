package chapter_2;

import java.util.Scanner;

public class Two_5 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the subtotal and a gratuity rate: ");
        double subtotal = in.nextDouble();
        double rate = in.nextDouble();
        System.out.println(String.format("The gratuity is $%.2f and total is $%.2f",subtotal * rate / 100, subtotal +subtotal * rate / 100));
    }
}
