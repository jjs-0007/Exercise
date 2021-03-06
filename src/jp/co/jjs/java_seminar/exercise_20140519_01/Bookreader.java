package jp.co.jjs.java_seminar.exercise_20140519_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Bookreader {

    public static ArrayList<Book> read(String filePath) {

        ArrayList<Book> books = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get(filePath), Charset.forName("SHIFT-JIS"))) {

            String line = null;

            while ((line = reader.readLine()) != null) {
                for (int i = 0; (reader.readLine()) != null; i++) {

                    String[] splitted = line.split(",");
                    Book book = new Book(splitted[0].trim(),
                            splitted[1].trim(), splitted[2].trim(),
                            splitted[3].trim(), Integer.parseInt(splitted[4]
                                    .trim()));
                    books.add(book);

                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return books;
    }
}
