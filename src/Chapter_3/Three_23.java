package Chapter_3;

import java.util.Scanner;

public class Three_23 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){

            System.out.println("Enter a point with two coordinates: ");
            double a = in.nextDouble(),b = in.nextDouble();
            System.out.printf("Point (%.1f, %.1f) is%s in the rectangle",a,b,check(a,b)?"":" not");

    }
    public static boolean check(double a, double b){
        a = Math.abs(a);
        b = Math.abs(b);
        if(a<5 && b<2.5)
            return true;
        else
            return false;
    }
}
