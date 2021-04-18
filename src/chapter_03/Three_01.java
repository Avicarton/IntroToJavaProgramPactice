package chapter_03;

import java.util.Scanner;

public class Three_01 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter a, b, c: ");
        double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();
        double r = b * b - 4 * a * c;
        int roots=r>=0?r==0?1:2:0;
        if(roots == 1){
            double rt = (-1 * b + Math.sqrt(r))/(-2 * a);
            System.out.println(String.format("Teh qeuation has one root %f",rt));
        }else if(roots == 2){
            double r1= (-1 * b + Math.sqrt(r))/(-2 * a), r2= (-1 * b - Math.sqrt(r))/(-2 * a);
            System.out.println(String.format("Teh qeuation has two roots %f and %f",r1, r2 ));
        }else {
            System.out.println(String.format("Teh qeuation has no real roots" ));
        }
    }
}
