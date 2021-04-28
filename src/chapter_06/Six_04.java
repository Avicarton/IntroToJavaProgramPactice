package chapter_06;

import java.util.Scanner;

public class Six_04 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Please enter an integer: ");
        System.out.printf("The reverse integer is %d",reverse(in.nextInt()));
    }
    public static int reverse(int number){
        int n = 0;
        while (number!=0){
            n = n * 10 + number % 10;
            number /= 10;
        }
        return n;
    }
}
