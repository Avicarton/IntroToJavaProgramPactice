package chapter_3;

import java.util.Scanner;

public class Three_20 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the temperature in Fahrenheit between -58℉ and 41℉: ");
        double temperature = in.nextDouble();
        if(temperature>41 || temperature<-58){
            System.out.println("温度无效!");
            System.exit(0);
        }
        System.out.println("Enter the wind speed (>=2) in miles per hour: ");
        double speed = in.nextDouble();

        if(speed<2){
            System.out.println("风速无效!");
            System.exit(0);
        }
        System.out.println(String.format("The wind chill index is %f",35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temperature * Math.pow(speed, 0.16)));
    }
}
