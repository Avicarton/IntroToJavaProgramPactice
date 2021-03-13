package Chapter_2;

import java.util.Scanner;

public class Two_7 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the number of minutes: ");
        long minutes = in.nextLong();
        long year = minutes / (365 * 24 *60);
        System.out.println(String.format("%d minutes is approximately %d years and %d days",minutes, year, (minutes /(60*24) -365*year )  ));
    }
}
