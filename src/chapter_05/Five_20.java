package chapter_05;

import java.util.Scanner;

public class Five_20 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        for(int i=2, count=1;i<=1000;i++){
            boolean flag = true;
            for(int j= 2;j*j<=i;j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.print(i);
                if(count==10){
                    System.out.println();
                    count = 1;
                }else{
                    System.out.print(" ");
                    count++;
                }
            }
        }
    }
}
