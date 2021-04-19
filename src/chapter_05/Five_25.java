package chapter_05;

import java.util.Scanner;

public class Five_25 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        double result = 0;
        for(int i = 10000;i<=100000;i=i+10000){
            for(int e=1,j=1; j<=i; e++,j=j+2){
                result -= Math.pow(-1, e) * (1.0)/j;
            }
            System.out.println(4*result);
            result = 0;
        }




    }
}
