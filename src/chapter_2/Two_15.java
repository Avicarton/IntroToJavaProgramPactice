package chapter_2;

import java.util.Scanner;

public class Two_15 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter x1 and y1: ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        System.out.println("Enter x2 and y2: ");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();

        System.out.println(String.format("The distance between the two points is %f",Math.pow(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2), 0.5)));
    }
}
