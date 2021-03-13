package Chapter_2;

import java.util.Scanner;

public class Two_13 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the monthly saving amount: ");
        double money = in.nextDouble();
        double sum = 0;
        double rate = 0.05 / 12;
        for(int i=1;i<=6;i++){
            sum += 100;
            sum = (1 + rate) * sum;
        }
        System.out.println(String.format("After the sixth month, the account value is $%.2f",sum));
    }
}
