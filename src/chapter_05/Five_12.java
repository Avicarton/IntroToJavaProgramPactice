package chapter_05;

import java.util.Scanner;

public class Five_12 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        //法一 暴力开方 :(int)Math.sqrt(12000) + 1
        //法二 while穷举
        int number = 0;
        while (number * number < 12000){
            number ++;
        }
        System.out.print(number);
    }
}
