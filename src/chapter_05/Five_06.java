package chapter_05;

import java.util.Scanner;

public class Five_06 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("英里\t\t\t\t千米\t\t\t\t千米\t\t\t\t英里\n");
        for (int i = 1, j = 20;i<=10;i=i+1, j=j+5){
            System.out.printf("%d\t\t\t\t%.3f\t\t\t\t%d\t\t\t\t%.3f\n",i,i * 1.609,j,j/1.609);
        }
    }
}
