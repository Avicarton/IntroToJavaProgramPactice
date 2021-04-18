package chapter_3;

import java.util.Scanner;

public class Three_21 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        String[] weeks = {"Saturday", "Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
        System.out.println("Enter year: ");
        int year = in.nextInt();
        System.out.println("Enter month: 1-12: ");
        int month = in.nextInt();
        if(month == 1){
            year -= 1;
            month = 13;
        }else if(month == 2){
            year -= 1;
            month = 14;
        }
        System.out.println("Enter the day of the month: 1-31: ");
        int day = in.nextInt();

        System.out.println(String.format("The day of the month is %s", weeks[week( day, year % 100, year / 100, month)]));

    }
    public static int week(int q, int k, int j, int m){
        return (int)(q + 26.0 * (m + 1.0)/(10.0) + k + k / 4.0 + j / 4.0 + 5.0 * j) % 7;
    }
}
