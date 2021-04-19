package chapter_05;

import java.util.Scanner;

public class Five_49 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter a string: ");
        String s = in.nextLine();
        int vowel = 0, consonant = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u' ||
                    s.charAt(i)=='A' ||s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U' ){
                vowel ++;
            }else if (s.charAt(i) != ' '){
                consonant ++;
            }
        }
        System.out.println("The number of vowels is " + vowel);

        System.out.println("The number of consonants is " + consonant);

    }
}
