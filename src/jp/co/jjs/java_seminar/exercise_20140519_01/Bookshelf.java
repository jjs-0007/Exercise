package jp.co.jjs.java_seminar.exercise_20140519_01;

import java.util.ArrayList;

public class Bookshelf {

    private ArrayList<Book> bookshelf = new ArrayList<>();

    public void add(Book book) {
        bookshelf.add(book);
    }

    public void addAll(ArrayList<Book> books) {
        bookshelf.addAll(books);
    }

    public void showAll() {
        for (Book book : bookshelf) {
            System.out.println(book);
        }
    }

}
