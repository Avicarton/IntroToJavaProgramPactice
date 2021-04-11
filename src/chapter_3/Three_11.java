package chapter_3;

import java.util.Scanner;

public class Three_11 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        String[] months = {"","January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println("Enter the year: ");
        int year = in.nextInt();
        System.out.println("Enter the month: ");
        int month = in.nextInt();
        int[] days= {0,31,yep(year)?29:28,31,30,31,30,31,31,30,31,30,31};

        System.out.println(String.format("%s %d has %d days",months[month], year,days[month]));
    }
    public static boolean yep (int n){
        if(n % 400 ==0 || (n % 4 == 0 && (n & 100) != 0)){
            return true;
        }else{
            return false;
        }
    }
}
