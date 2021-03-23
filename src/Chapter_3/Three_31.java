package Chapter_3;

import java.util.Scanner;

public class Three_31 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the exchange rate from dollars to RMB: ");
        double c = in.nextDouble();
        System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int mod = in.nextInt();
        if(mod == 1){
            System.out.println("Enter the RMB mount: ");
            double rmb = in.nextDouble();
            System.out.println(String.format("%.1f yuan is $%.1f yuan",rmb,1.0/c*rmb));
        }else if(mod == 0) {
            System.out.println("Enter the dollar mount: ");
            double dollars = in.nextDouble();
            System.out.println(String.format("$%.1f is %.1f yuan",dollars,c*dollars));
        }else
            System.out.println("Incorrect input");


        System.out.println(String.format(" " ));

    }
}
