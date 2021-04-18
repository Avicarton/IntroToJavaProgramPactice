package chapter_2;

import java.util.Scanner;

public class Two_19 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the coordinates of three points separated by spaces\nlike x1 y1 x2 y2 x3 y3: ");
        double x1 = in.nextDouble(), y1 = in.nextDouble(), x2 = in.nextDouble(), y2 = in.nextDouble(), x3 = in.nextDouble(), y3 = in.nextDouble();
        double s1= length(x1, y1, x2, y2), s2= length(x1, y1, x3, y3), s3= length(x2, y2, x3, y3);
        double c = (s1 + s2 + s3) / 2;
        double area = Math.sqrt(c * (c - s1)* (c - s2)* (c - s3));
        System.out.println(String.format("The area of the triangle is %.2f",area));
    }
    public static double length(double x1, double y1, double x2, double y2){
        return Math.pow(Math.pow( x2 - x1, 2) +Math.pow(y2 - y1 , 2) ,0.5);
    }
}
