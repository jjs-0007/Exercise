package jp.co.jjs.java_seminar.exercise_20140515_04;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("abc");
        set.add("def");
        set.add("ghi");

        System.out.println(set);

        set.add("def");

        System.out.println(set);

        set.remove("def");

        System.out.println(set);

    }

}
