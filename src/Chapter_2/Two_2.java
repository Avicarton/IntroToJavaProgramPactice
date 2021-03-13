package Chapter_2;

import java.util.Scanner;

public class Two_2 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the radius and length of a cylinder: ");
        double radius = in.nextDouble();
        double length = in.nextDouble();
        System.out.println(String.format("The area is %.2f\nThe volume is %.2f", radius * radius * Math.PI, length * radius * radius * Math.PI));
    }
}
