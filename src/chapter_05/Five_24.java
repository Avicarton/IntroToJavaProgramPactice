package chapter_05;

import java.util.Scanner;

public class Five_24 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        double sum = 0;
        for(int i=1,j=3;i<99;i=i+2,j=j+2){
            sum += (double)i/(double)j;
        }
        System.out.println("Sum is " + sum);
    }
}
