package chapter_3;

import java.util.Scanner;

public class Three_25 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        //ax + by = e       cx+dy=f
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double  x1 = in.nextDouble(), y1 = in.nextDouble(),
                x2 = in.nextDouble(), y2 = in.nextDouble(),
                x3 = in.nextDouble(), y3 = in.nextDouble(),
                x4 = in.nextDouble(), y4 = in.nextDouble();
        double a = y1 - y2, b = -(x1 - x2), c = y3 - y4, d = -(x3 - x4),
                e = (y1 - y2) * x1 - (x1 - x2) * y1, f = (y3 - y4) * x3 - (x3 - x4) * y3;
        if(a * d - b * c == 0){
            System.out.println("The two lines are parallel.");
        }else {
            System.out.printf("The intersecting point is at (%.5f, %.5f)",(e * d - b * f)/(a * d - b * c),(a * f - e * c)/(a * d - b * c));
        }
    }
}
