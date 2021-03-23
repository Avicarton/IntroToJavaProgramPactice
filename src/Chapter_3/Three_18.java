package Chapter_3;

import java.util.Scanner;

public class Three_18 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){

        double c = in.nextDouble();
        if(c<=0)
            System.out.println(String.format("Invalid input"));
        else if(c>20)
            System.out.println(String.format("the package cannot be shipped"));
        else{
            System.out.println(String.format("You need pay: $%.2f",c>10?(10.5*c):c>3?(8.5*c):c>1?(5.5*c):(2.5*c)));
        }
    }
}
