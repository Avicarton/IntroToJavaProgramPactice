package Chapter_3;

import java.util.Scanner;

public class Three_8 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        /*
        System.out.println("Enter three numbers: ");
        int[] arr = new int[3];
        arr[0] = in.nextInt();arr[1] = in.nextInt();arr[2] = in.nextInt();

        for(int i =0 ; i<arr.length-1 ; i++) {
            for(int j=0 ; j<arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

         */


        int a=in.nextInt(),b=in.nextInt(),c=in.nextInt();
        System.out.println(String.format("%d  %d  %d",Math.min(Math.min(a,b),c),a+b+c-Math.min(Math.min(a,b),c)-Math.max(Math.max(a,b),c),Math.max(Math.max(a,b),c)));

    }
}
