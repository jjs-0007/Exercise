package jp.co.jjs.java_seminar.exercise_20140519_01;

import java.util.ArrayList;

public class Main extends Bookreader {
    public static void main(String[] args) {

        ArrayList<Book> books = Bookreader.read("Book1.csv");
        Bookshelf bookshelf = new Bookshelf();
        bookshelf.addAll(books);
        bookshelf.showAll();
    }
}
