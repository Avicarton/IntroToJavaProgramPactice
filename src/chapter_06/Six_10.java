package chapter_06;

import java.util.Scanner;

public class Six_10 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        int count = 0;
        for(int i=2;i<=10000;i++)
            if(isPrime(i))
                count ++;
        System.out.println(count);
    }
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // number is not a prime
            }
        }

        return true; // number is prime
    }
}
