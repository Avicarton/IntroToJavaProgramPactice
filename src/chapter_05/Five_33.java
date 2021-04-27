package chapter_05;

import java.util.Scanner;

public class Five_33 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        int number = 1;
        while(number<10000){
            int sumOfFactors=0;
            for(int j = 1;j<number;j++){
                if(number % j == 0){
                    sumOfFactors += j;
                }
            }
            if(sumOfFactors == number)
                System.out.println(sumOfFactors);
            number++;
        }
    }
}
