package chapter_05;

import java.util.Scanner;

public class Five_09 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("请输入学生个数: ");
        int count = in.nextInt();
        String name1 = "", name2 = "";
        int max1 = 0, max2 = 0;
        for (int i=1;i<=count;i++){
            String tname = in.next();
            int tscore = in.nextInt();
            if ( tscore > max1){
                max1 = tscore;
                name1 = tname;
            }else if(tscore > max2){
                max2 = tscore;
                name2 = tname;
            }
        }

        System.out.println("得分最高的是: " + name1);

        System.out.println("得分第二高的是: " + name2);


    }
}
