package chapter_05;

import java.util.Scanner;

public class Five_50 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter a string: ");
        String s = in.nextLine();
        int count = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
                count ++;
        }
        System.out.println("The number of uppercase letters is " + count);
    }
}
