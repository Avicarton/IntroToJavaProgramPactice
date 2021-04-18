package chapter_02;

import java.util.Scanner;

public class Two_08 {
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
        System.out.println("The current time is "+(hour+timezone)+":"+mintue+":"+seconds);
    }
}
