package chapter_05;

import java.util.Scanner;

public class Five_18 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("### 1");
        for(int i=1 ;i<=6;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("### 2");
        for(int i=6 ;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("### 3");
        for(int i=1 ;i<=6;i++){
            for(int j=1;j<=6 - i;j++){
                System.out.print(" "+" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("### 4");
        for(int i=6 ;i>=1;i--){
            for(int j=1;j<=6 - i;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();

    }
}
