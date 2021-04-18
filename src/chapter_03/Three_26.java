package chapter_3;

import java.util.Scanner;

public class Three_26 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter an integer");
        int c = in.nextInt();
        System.out.printf("Is %d divisible by 5 and 6? %s\n",c,(c%5==0&&c%6==0)?"true":"false");
        System.out.printf("Is %d divisible by 5 or 6? %s\n",c,(c%5==0||c%6==0)?"true":"false");
        System.out.printf("Is %d divisible by 5 and 6, but not both? %s\n",c,(c%5==0^c%6==0)?"true":"false");
    }
}
