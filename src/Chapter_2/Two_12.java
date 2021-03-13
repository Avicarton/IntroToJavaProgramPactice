package Chapter_2;

import java.util.Scanner;

public class Two_12 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter speed and acceleration: ");
        double speed = in.nextDouble();
        double acceleration = in.nextDouble();
        System.out.println(String.format("The minimum runway length for this airplane if %.3f", speed * speed / (2 * acceleration)));
    }
}
