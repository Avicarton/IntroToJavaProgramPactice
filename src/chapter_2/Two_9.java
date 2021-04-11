package chapter_2;

import java.util.Scanner;

public class Two_9 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter v0, v1, and t: ");
        double v0 = in.nextDouble();
        double v1 = in.nextDouble();
        double t = in.nextDouble();
        System.out.println(String.format("The average acceleration is %.4f",(v1 - v0)/t));
    }
}
