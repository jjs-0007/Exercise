package jp.co.jjs.java_seminar.exercise_20140514_01;

public class Book {

    // 属性
    String title; // 本のタイトル
    String ISBNNumber; // isbn番号
    String author; // 本の著者
    String publisher; // 出版社

    // 状態
    boolean isLent; // 貸し出し状況

    public Book(String title) {
        this.title = title;
    }

    // 貸し出し状況を「貸し出される」という状態に変更する
    public void lent() {
        isLent = true;
    }

}
