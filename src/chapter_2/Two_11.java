package chapter_2;

import java.util.Scanner;

public class Two_11 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the number of years:");
        int years = in.nextInt();
        int second = 0;
        int nowpeople = 312032486;
        second = 365 * 24 * 60 * 60;
        double birth = second / 7.0;
        double death = second / 13.0;
        double immigrant = second / 45.0;
        int oneyears = (int)(birth - death + immigrant);
        int people = nowpeople + years * oneyears;
        System.out.println(String.format("The population in %d years is %d" ,years, people));

    }
}
