package chapter_06;

import java.util.Scanner;

public class Six_06 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Please enter an integer: ");
        displayPattern(in.nextInt());
    }
    public static void displayPattern(int n){
        for(int i=1 ;i<=n;i++){
            for(int j=1;j<=n - i;j++){
                System.out.print(" "+" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
