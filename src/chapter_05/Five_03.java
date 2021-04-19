package chapter_05;

import java.util.Scanner;

public class Five_03 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println(String.format("千克\t\t\t磅"));
        for (int i =1;i<=200;i=i+2){
            System.out.println(String.format("%d\t\t\t%.1f",i,i * 2.2));
        }
    }
}
