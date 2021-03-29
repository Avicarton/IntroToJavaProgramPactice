package Chapter_3;

import java.util.Random;
import java.util.Scanner;

public class Three_24 {
    public static Scanner in = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args){
        String[] card = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] color = { "Clubs", "Diamonds", "Hearts", "Spades"};
        int c = rand.nextInt(13);
        int y = rand.nextInt(4);
        System.out.println(String.format("The card you picked is %s of %s",card[c], color[y]));
    }
}
