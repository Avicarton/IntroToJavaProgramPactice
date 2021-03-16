package Chapter_3;

import java.util.Scanner;

public class Three_8 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter three numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));

        //System.out.println(String.format("Output: %d %d %d",max,,min));

    }
}
