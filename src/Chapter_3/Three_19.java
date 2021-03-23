package Chapter_3;

import java.util.Scanner;

public class Three_19 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();
        if(a + b > c && a + c > b && c + b > a)
            System.out.println(a+b+c);
        else
            System.out.println(String.format("无法构成三角形"));

    }
}
