package jp.co.jjs.java_seminar.exercise_20140519_01;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class Bookwriter {
    {
        public static void write(String csvFilePath, ArrayList<Book> books {

                try (BufferedWriter writer = Files.newBufferedWriter(
            Paths.get(csvFilePath), Charset.forName("SHIFT-JIS"),
            StandardOpenOption.CREATE)) {

                    writer.write("書籍名,ISBN番号,著者,出版社,価格");
                    writer.newLine();

                    for(Book book: books) {
                        writer.write("aaaa");
                        writer.newLine();
                    }


    } catch (IOException e) {
        e.printStackTrace();
    }
        }
    }

}

