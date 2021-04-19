package chapter_05;

import java.util.Scanner;

public class Five_07 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        final double RATE = 0.05;
        int sum = 0, now_fare = 10000;
        System.out.print("");
        for(int i=1;i<=14;i++){
            now_fare *= 1 + RATE;
            if(i>10){
                sum += now_fare;
            }
        }

    }
}
