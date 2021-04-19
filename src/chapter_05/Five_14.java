package chapter_05;

import java.util.Scanner;

public class Five_14 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        //法一可用辗转相除法
        //法二穷举
        System.out.print("输入两个整数: ");
        int a = in.nextInt(), b = in.nextInt();
        for(int i = a>b?a:b;i>=1;i--){
            if(a % i == 0 && b % i == 0){
                System.out.printf("最大公约数为: %d",i);
                break;
            }
        }
    }
}
