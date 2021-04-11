package chapter_3;

import java.util.Scanner;

public class Three_27 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter a point's x- and y-coordinates: ");
        double c = in.nextDouble(), d = in.nextDouble();
        if(c < 0 || d <0 || 0.5 * c + d > 100)
            System.out.println("The point is not in the triangle");
        else
            System.out.println("The point is in the triangle");
    }
}
