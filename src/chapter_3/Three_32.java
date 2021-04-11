package chapter_3;

import java.util.Scanner;

public class Three_32 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter tree points for p0, p1 and p2:");
        double x0=in.nextDouble(),y0=in.nextDouble(),x1=in.nextDouble(),y1=in.nextDouble(),x2=in.nextDouble(),y2=in.nextDouble();
        double dis = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        System.out.printf("p2 is on the %s line",dis >=0 ? dis == 0?"same":"left side of the":"right side of the");

    }
}
