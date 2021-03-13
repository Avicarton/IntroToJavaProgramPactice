package Chapter_2;

import java.util.Scanner;

public class Two_14 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter weight in pounds: ");
        double weight = in.nextDouble();
        System.out.println("Enter height in inches: ");
        double height = in.nextDouble();
        System.out.println(String.format("BMI is %.4f",(weight * 0.45359237)/Math.pow((height * 0.0254), 2)));
    }
}
