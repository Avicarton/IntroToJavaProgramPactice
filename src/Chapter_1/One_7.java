package chapter_1;

import java.lang.Math;

public class One_7 {
    public static double Cal(int ends){
        double result = 0;
        for(int i=1,j=1; j<=ends; i++,j=j+2){
            result -= Math.pow(-1, i) * (1.0)/j;
        }

        return 4 * result;
    }

    public static void main(String[] args){
        System.out.println(Cal(11));
        System.out.println(Cal(13));
    }
}
