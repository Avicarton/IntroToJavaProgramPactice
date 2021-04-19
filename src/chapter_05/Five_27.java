package chapter_05;

import java.util.Scanner;

public class Five_27 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Output leap year from 101 to 2100: ");
        int leap = 0;
        for(int i = 101, count = 1;i<=2100;i++){
            if(i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)){
                System.out.print(i);
                leap ++;
                if(count == 10){
                    System.out.println();
                    count = 1;
                }else{
                    count ++;
                    System.out.print(" ");
                }
            }
        }
        System.out.println("\n\nThe number of leap year is: " + leap);
    }
}
