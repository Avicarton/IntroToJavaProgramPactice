package Chapter_1;

public class One_11 {

    public static void main(String[] args){
        double onedayborn = 24 * 60 * 60 / 7;
        double onedaydie = 24 * 60 * 60 / 13;
        double onedayin = 24 * 60 * 60 / 45;
        int yesr = (int)(onedayborn - onedaydie +onedayin) * 365;
        long people = 312_032_486;
        for(int i=1; i<=5; i++){
            people += yesr;
            System.out.printf("第%d年人口为%d\n",i,people);
        }

    }

}
