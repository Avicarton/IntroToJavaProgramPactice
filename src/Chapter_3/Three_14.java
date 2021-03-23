package Chapter_3;

import java.util.Scanner;

public class Three_14 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("猜硬币\n如果你认为是正面输入1,反面输入0");
        int gue = in.nextInt();
        if(gue == (int)(Math.random()+0.5)){
            System.out.println("恭喜你猜对了!");
        }else
            System.out.println("很遗憾你没有猜对...");

    }
}
