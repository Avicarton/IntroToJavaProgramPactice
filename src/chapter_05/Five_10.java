package chapter_05;

import java.util.Scanner;

public class Five_10 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        for(int i=100,count = 0;i<=1000;i++){
            if (i % 5 ==0 && i % 6 == 0){
                System.out.printf("%d ",i);
                if(count == 9){
                    count = 0;
                    System.out.println();
                }else{
                    count ++;
                    System.out.print(" ");
                }
            }
        }
    }
}
