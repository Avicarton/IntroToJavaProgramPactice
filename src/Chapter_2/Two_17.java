package Chapter_2;

import java.util.Scanner;

public class Two_17 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the temperature in Fahrenheit between -58℉ and 41℉: ");
        double temperature = in.nextDouble();
        System.out.println("Enter the wind speed (>=2) in miles per hour: ");
        double speed = in.nextDouble();
        System.out.println(String.format("The wind chill index is %f",35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temperature * Math.pow(speed, 0.16)));
    }
}
