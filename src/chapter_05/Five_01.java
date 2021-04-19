package chapter_05;

import java.util.Scanner;

public class Five_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int count = -1, sum = 0, pos = 0, neg = 0, now = 0;
        do {
            sum += now;
            now = input.nextInt();
            count ++;
            if(now > 0){
                pos ++;
            }else if (now < 0){
                neg ++;
            }
        }while(now != 0);

        System.out.println("The number of positives is " + pos);

        System.out.println("The number of negatives is " + neg);

        System.out.println(String.format("The total is %.1f", (double)sum));

        System.out.println(String.format("The average is %.2f", (double)sum / (double)count));

    }
}
