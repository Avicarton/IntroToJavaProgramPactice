package Chapter_2;

import java.util.Scanner;

public class Two_3 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter a value for feet: ");
        double feet = in.nextDouble();
        System.out.println(String.format("%.2f feet is %.4f meters",feet,feet * 0.305));
    }
}
