package chapter_05;

import java.util.Scanner;

public class Five_48{
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter a string: ");
        String s = in.nextLine();
        for(int i =0;i<s.length();i=i+2){
            System.out.print(s.charAt(i));
        }
    }
}
