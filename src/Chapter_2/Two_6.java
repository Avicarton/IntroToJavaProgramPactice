package Chapter_2;

import java.util.Scanner;

public class Two_6 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter a number between 0 and 1000: ");
        String s = in.nextLine();
        char[] cc = s.toCharArray();
        int sum = 0;
        for(int i=0;i<cc.length;i++) sum += cc[i]-'0';
        System.out.println(String.format("The sum of the digits is %d",sum));
    }
}
