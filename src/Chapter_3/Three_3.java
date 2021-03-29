package chapter_3;

import java.util.Scanner;

public class Three_3 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter a, b, c, d, e, f: ");
        double a = in.nextDouble(),b = in.nextDouble(),c = in.nextDouble(),d = in.nextDouble(),e = in.nextDouble(),f = in.nextDouble();
        if(a * d - b * c == 0){
            System.out.println("The equation has no solution.");
        }else {
        System.out.printf("x = %.2f and y = %.2f",(e * d - b * f)/(a * d - b * c),(a * f - e * c)/(a * d - b * c));
    }
    }
}
