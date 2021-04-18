package chapter_3;

import java.util.Scanner;

public class Three_22 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter a point with two coordinates: ");
        double a = in.nextDouble(),b = in.nextDouble();
        System.out.printf("Point (%.1f, %.1f) is%s in the circle",a,b,dist(a,b)<10?"":" not");
    }
    public static double dist(double a, double b){
        return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

    }
}
