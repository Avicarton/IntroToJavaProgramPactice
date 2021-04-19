package chapter_05;

import java.util.Scanner;

public class Five_26{
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        //自认为写的很巧妙(bushi 但是会爆数据范围的代码
//        double e = 1;
//        int last = 1;
//        long fact_ = 1;
//        for(int i=10000;i<=100000;i=i+10000,last=last+10000){
//            for(int j = last;j<=i;j++){
//                fact_ *= j;
//                e += 1.0/(fact_);
//            }
//            System.out.println(e);
//        }
        double e = 1;
        double item = 1;
        int last = 1;
        for(int i=10000;i<=100000;i=i+10000,last=last+10000){
            for(int j = last;j<=i;j++){
                item /= j;
                e += item;
            }
            System.out.println("When i = " + i + ", e is " + e);
        }
    }
}
