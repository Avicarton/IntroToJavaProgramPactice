package chapter_3;

import java.util.Scanner;

public class Three_28 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter r1's center x-, y-coordinates, width, and height: ");
        double x1 = in.nextDouble(), y1 = in.nextDouble(), w1 = in.nextDouble(), h1 = in.nextDouble();

        System.out.println("Enter r2's center x-, y-coordinates, width, and height: ");
        double x2 = in.nextDouble(), y2 = in.nextDouble(), w2 = in.nextDouble(), h2 = in.nextDouble();

        double x_dist = Math.abs(x2 - x1);
        double y_dist = Math.abs(y2 - y1);

        if(x_dist <= (w1 - w2) / 2 && y_dist <= (h1 - h2) / 2){
            System.out.println("r2 is inside r1");
        }else if(x_dist <= (w1 + w2) / 2 && y_dist <= (h1 + h2) / 2){
            System.out.println("r2 overlaps r1");
        }else{
            System.out.println("r2 does not overlap r1");
        }

    }
}
