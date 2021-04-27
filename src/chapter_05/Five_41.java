package chapter_05;

import java.util.Scanner;

public class Five_41 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        int  count = 0,tmp = in.nextInt(),max = 0;
        while(tmp != 0){
            if (max < tmp){
                max = tmp;
                count = 1;
            }else if(tmp == max) {
                count ++;
            }
            tmp = in.nextInt();
        }
        System.out.println("Max is " + max + ", Count is " + count);

        

    }
}
