package Chapter_2;

import java.util.Scanner;

public class Two_4 {

        public static Scanner in = new Scanner(System.in);
        public static void main(String[] args){
            System.out.println("Enter a number in pounds: ");
            double feet = in.nextDouble();
            System.out.println(String.format("%.2f pounds is %.4f kilograms",feet,feet * 0.454));
        }

}
