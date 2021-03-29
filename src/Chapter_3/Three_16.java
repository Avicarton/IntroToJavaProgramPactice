package chapter_3;

import java.util.Scanner;

public class Three_16 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        int a = (int)Math.pow(-1,(int)(Math.random()*100))*(int)(Math.random()*100);
        int b = (int)Math.pow(-1,(int)(Math.random()*100))*(int)(Math.random()*50);

        System.out.printf("(%d,%d)",a,b);

    }
}
