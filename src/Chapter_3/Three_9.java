package Chapter_3;

import java.util.Scanner;

public class Three_9 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        String s = in.nextLine();
        char[] cc = s.toCharArray();
        int num = (cc[0]-'0' + (cc[1]-'0') * 2 + (cc[2]-'0') * 3 + (cc[3]-'0') * 4 + (cc[4]-'0') * 5 + (cc[5]-'0') * 6 + (cc[6]-'0') * 7 + (cc[7]-'0') * 8 + (cc[8]-'0') * 9 ) % 11;
        System.out.println(String.format("The ISBN-10 number is %s%s",s,num == 10?"X":String.valueOf(num)));

    }
}
