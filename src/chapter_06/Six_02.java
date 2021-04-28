package chapter_06;

import java.util.Scanner;

public class Six_02 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Please enter an integer: ");
        System.out.printf("The sum of digits is: %d",sumDigits(in.nextInt()));
    }
    public static int sumDigits(long n){
        int sum = 0;
        while(n!=0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

}
