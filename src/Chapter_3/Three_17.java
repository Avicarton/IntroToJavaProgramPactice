package Chapter_3;

import java.util.Random;
import java.util.Scanner;

public class Three_17 {
    public static Scanner in = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args) {
        System.out.print("scissor (0), rock (1), paper (2): ");
        int n = in.nextInt();
        int robot = rand.nextInt(3);

        if(n == 0 && robot == 0)
            System.out.println("The computer is scissor. You are scissor too. It is a draw.");
        else if(n == 1 && robot == 1)
            System.out.println("The computer is rock. You are rock too. It is a draw.");
        else if(n == 2 && robot == 2)
            System.out.println("The computer is paper. You are paper too. It is a draw.");
        else if(n == 0 && robot == 2)
            System.out.println("The computer is paper. You are scissor. You won.");
        else if(n == 1 && robot == 0)
            System.out.println("The computer is scissor. You are rock. You won.");
        else if(n == 2 && robot == 1)
            System.out.println("The computer is rock. You are paper. You won.");
        else if(n == 0  )
            System.out.println("The computer is rock. You are scissor. You Loss.");
        else if(n == 1  )
            System.out.println("The computer is paper. You are rock. You Loss.");
        else if(n == 2 )
            System.out.println("The computer is scissor. You are paper. You Loss.");



    }
}
