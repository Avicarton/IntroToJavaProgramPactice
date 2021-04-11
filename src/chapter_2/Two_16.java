package chapter_2;

import java.util.Scanner;

public class Two_16 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the length of the side: ");
        double length = in.nextDouble();
        System.out.println(String.format("The area of the hexagon is %.4f",length * length * 3 * Math.pow(3, 0.5) / 2));
    }
}
