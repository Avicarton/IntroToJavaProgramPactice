package Chapter_3;

import java.util.Scanner;

public class Three_12 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        /*
        方法一:
        System.out.println("Enter a three-digit integer: ");
        int n = Math.abs(in.nextInt());
        String s = String.valueOf(n);
        if(s.charAt(0) == s.charAt(2)){
            System.out.println(String.format("%s is a palindrome",s));
        }else{
            System.out.println(String.format("%s is not a palindrome",s));
        }
         */

        /*
        方法二:
        System.out.println("Enter a three-digit integer: ");
        int s = Math.abs(in.nextInt());
        if(s / 100 == s % 10){
            System.out.println(String.format("%d is a palindrome",s));
        }else{
            System.out.println(String.format("%d is not a palindrome",s));
        }
         */
        System.out.println("Enter a three-digit integer: ");
        int n = Math.abs(in.nextInt());
        String s = String.valueOf(n);
        String x = "";
        for(int i=s.length() - 1; i>=0;i--){
            x += s.charAt(i);
        }
        if(Integer.parseInt(s) == Integer.parseInt(x)){
            System.out.println(String.format("%d is a palindrome",n));
        }else{
            System.out.println(String.format("%d is not a palindrome",n));
        }
    }
}
