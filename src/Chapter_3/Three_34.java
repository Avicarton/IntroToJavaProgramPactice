package Chapter_3;

import java.util.Scanner;

public class Three_34 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter three points for p0, p1, and p2: ");

        double  p0x = in.nextDouble(), p0y = in.nextDouble(),
                p1x = in.nextDouble(), p1y = in.nextDouble(),
                p2x = in.nextDouble(), p2y = in.nextDouble();
        boolean flag = false;
        if(len(p0x,p0y,p1x,p1y) == len(p1x,p1y,p2x,p2y) + len(p0x,p0y,p2x,p2y))
            flag = true;
        System.out.println(String.format("(%.1f, %.1f) is %son the line sagment form (%.1f, %.1f) to (%.1f, %.1f)",p2x,p2y,flag?"":"not " ,p0x,p0y,p1x,p1y));

    }
    public static double len (double x1, double y1, double x2, double y2){
        return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
    }
}
