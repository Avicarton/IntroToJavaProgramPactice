package chapter_05;

import java.util.Scanner;

public class Five_05 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("千克\t\t\t\t磅\t\t\t\t磅\t\t\t\t千克\n");
        for (int i = 1, j = 20;i<=200;i=i+2, j=j+5){
            System.out.printf("%d\t\t\t\t%.1f\t\t\t\t%d\t\t\t\t%.2f\n",i,i * 2.2,j,j/2.2);
        }
    }
}
