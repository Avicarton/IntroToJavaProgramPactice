package Chapter_3;

import java.util.Scanner;

public class Three_12 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter a three-digit integer: ");
        String s = in.nextLine();
        if(s.charAt(0) == s.charAt(2)){
            System.out.println(String.format("%s is a palindrome",s));
        }else{
            System.out.println(String.format("%s is not a palindrome",s));
        }
        /*
        方法二:
        System.out.println("Enter a three-digit integer: ");
        int s = in.nextInt();
        if(s / 100 == s % 10){
            System.out.println(String.format("%d is a palindrome",s));
        }else{
            System.out.println(String.format("%d is not a palindrome",s));
        }
         */

    }
}
