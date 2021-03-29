package Chapter_3;

import java.util.Scanner;

public class Three_29 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter circle1's center x-, y-coordinates, and radius: ");
        double x1 = in.nextDouble(), y1 = in.nextDouble(), r1 = in.nextDouble();
        System.out.println("Enter circle1's center x-, y-coordinates, and radius: ");
        double x2 = in.nextDouble(), y2 = in.nextDouble(), r2 = in.nextDouble();
        double dist = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        if(dist > r1 + r2)
            System.out.println("circle2 does not overlap circle1");
        else if(dist < Math.abs(r1 - r2))
            System.out.println("circle2 is inside circle1");
        else
            System.out.println("circle2 overlap circle1");
    }
}
