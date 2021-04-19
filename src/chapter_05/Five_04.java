package chapter_05;

import java.util.Scanner;

public class Five_04 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println(String.format("英里\t\t\t千米"));
        for (int i =1;i<=10;i=i+1){
            System.out.println(String.format("%d\t\t\t%.3f",i,i * 1.609));
        }
    }
}
