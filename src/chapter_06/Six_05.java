package chapter_06;

import java.util.Scanner;

public class Six_05 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        //总觉得这样写会有精度丢失问题
        double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();
        displaySortedNumbers(a,b,c);
    }

    public static void displaySortedNumbers(double num1,double num2,double num3){
        double max = Math.max(Math.max(num1,num2),num3);
        double min = Math.min(Math.min(num1,num2),num3);

        System.out.printf("%f %f %f",max,num1 + num2 + num3 - max - min,min);


    }
}
