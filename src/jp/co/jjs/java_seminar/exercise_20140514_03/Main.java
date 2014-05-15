package jp.co.jjs.java_seminar.exercise_20140514_03;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("国語");
        Book book2 = new Book("数学");
        Book book3 = new Book("社会");
        Book book4 = new Book("理科");
        Book book5 = new Book("英語");

        System.out.println(book1.title);
        System.out.println(book2.title);
        System.out.println(book3.title);
        System.out.println(book4.title);
        System.out.println(book5.title);
    }
}
