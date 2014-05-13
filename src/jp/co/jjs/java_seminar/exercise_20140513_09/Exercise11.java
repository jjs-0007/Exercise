package jp.co.jjs.java_seminar.exercise_20140513_09;

public class Exercise11 {
    public static void main(String[] args) {
        int kaimono = 8500;
        int siharai = 75000;
        int oturi = siharai - kaimono;

        System.out.println("買い物した金額：" + kaimono);
        System.out.println("支払った金額  ：" + siharai);
        System.out.println("お釣り        ：" + oturi);
        
        System.out.println("10000円：" + oturi / 10000);
        System.out.println("5000円 ：" + oturi % 10000 / 5000);
        System.out.println("1000円 ：" + oturi % 10000 % 5000 / 1000);
        System.out.println("500円  ：" + oturi % 10000 % 5000 % 1000 / 500);
        System.out.println("100円  ：" + oturi % 10000 % 5000 % 1000 % 500 / 100);
        System.out.println("50円   ：" + oturi % 10000 % 5000 % 1000 % 500 % 100 / 50);
        System.out.println("10円   ：" + oturi % 10000 % 5000 % 1000 % 500 % 100 % 50 / 10);
        System.out.println("5円    ：" + oturi % 10000 % 5000 % 1000 % 500 % 100 % 50 % 10 / 5);
        System.out.println("1円    ：" + oturi % 10000 % 5000 % 1000 % 500 % 100 % 50 % 10 % 5 / 1);
    }
}
