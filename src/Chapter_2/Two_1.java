package Chapter_2;

import java.util.Scanner;

public class Two_1 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter a degree in Celsius: ");
        double c = in.nextDouble();
        System.out.println(String.format("%.2f Celsius is %.2f Fahrenheit.",c, (9.0/5) * c + 32));

    }
}
