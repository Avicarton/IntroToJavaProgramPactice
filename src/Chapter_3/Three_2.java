package chapter_3;

import java.util.Scanner;

public class Three_2 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){

        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() * 7 % 10);
        int number3 = (int)(System.currentTimeMillis() * 4 % 10);

        System.out.print(
                "What is " + number1 + " + " + number2 + " + " + number3 + "? ");

        int answer = in.nextInt();

        System.out.println(
                number1 + " + " + number2 + " + "+ number3 + " = " + answer + " is " +
                        (number1 + number2+ number3 == answer));
    }
}
