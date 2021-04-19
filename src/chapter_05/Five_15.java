package chapter_05;

import java.util.Scanner;

public class Five_15 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        for (char i = '!', count = 0; i <= '~'; i++) {
            System.out.printf("%c", i);
            if (count == 9) {
                count = 0;
                System.out.println();
            } else {
                System.out.print(" ");
                count++;
            }
        }
    }
}
