package chapter_06;

import java.util.Scanner;

public class Six_01 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        for(int i=1;i<=100;i++){
            System.out.printf("%7d",getPentagonalNumber(i));
            if(i % 10 == 0)
                System.out.println();
        }
    }
    public static int getPentagonalNumber(int n){
        return n * (3 * n - 1) / 2;
    }

}
