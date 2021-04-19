package chapter_05;

import java.util.Scanner;

public class Five_46 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter a string: ");
        String s = in.nextLine();
        System.out.print("The reversed string is: ");
        for(int i = s.length() - 1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
}
