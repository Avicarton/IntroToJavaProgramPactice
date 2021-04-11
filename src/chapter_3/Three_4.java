package chapter_3;

import java.util.Scanner;

public class Three_4 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        int random = (int)(Math.random()*100 )% 12 + 1;
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println(String.format("随机生成的月份为:%d\n对应的英文为:%s",random,month[random-1]));


    }
}
