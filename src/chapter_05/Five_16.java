package chapter_05;

import java.util.Scanner;

public class Five_16 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int p = 2;

        while(n > p){
            if(n % p == 0){
                n /= p;
                System.out.print(p + " ");
            }else {
                p++;
            }
        }
        System.out.println(n);

    }
}
