package Chapter_3;

import java.util.Scanner;

public class Three_15 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("输入一个三位数作为你的幸运数字");
        int n = in.nextInt();

        int g = (int)(Math.random() * 10);
        int s = (int)(Math.random() * 10);
        int b = (int)(Math.random() * 10);
        int fina = g + s * 10 + b * 100;
        if(n == fina){
            System.out.println(String.format("你输入的数字是%d,大奖数字是%d\n恭喜你获得$10 000" ,n, fina));
        }else if((n/100==g||n%100==g ||n%10/10==g)&&(n/100==s||n%100==s ||n%10/10==s)&&(n/100==b||n%100==b ||n%10/10==b)){

        }

    }
}
