package chapter_1;

public class One_11 {

    public static void main(String[] args){
        int second = 0;
        int nowpeople = 312032486;
        second = 365 * 24 * 60 * 60;
        double birth = second / 7.0;
        double death = second / 13.0;
        double immigrant = second / 45.0;
        int years = 5;
        int oneyears = (int)(birth - death + immigrant);
        int people = nowpeople + years * oneyears;
        System.out.println("The population in 5 years is " + people);

    }

}
