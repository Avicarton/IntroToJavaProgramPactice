package chapter_3;

import java.util.Scanner;

public class Three_30 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the time offset to GMT: ");
        int timezone = in.nextInt();
        long time =System.currentTimeMillis();
        time = time/1000;
        long seconds = time%60;
        time = time/60;
        long mintue = time%60;
        time = time/60;
        long hour = time%24;
        long hhh = hour+timezone;
        System.out.printf("The current time is %d:%d:%d %s",hhh>=12?hhh-12:hhh,mintue,seconds,hhh>=12?"PM":"AM");
    }
}
