package chapter_03;

import java.util.Scanner;

public class Three_05 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){

        String[] week = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        System.out.println("Enter today's day: ");
        int now = in.nextInt();
        System.out.println("Enter the num of days elapsed since today: ");
        int next = in.nextInt();
        System.out.println(String.format("Today is %s and the future day is %s", week[ now ], week[ (now + next) % 7 ]));

    }
}
