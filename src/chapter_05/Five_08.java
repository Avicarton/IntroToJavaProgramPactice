package chapter_05;

import java.util.Scanner;

public class Five_08 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("请输入学生个数: ");
        int count = in.nextInt();
        String name = "";
        int max = 0;
        for (int i=1;i<=count;i++){
            String tname = in.next();
            int tscore = in.nextInt();
            if ( tscore > max){
                max = tscore;
                name = tname;
            }
        }

        System.out.println("得分最高的是: " + name);

    }
}
