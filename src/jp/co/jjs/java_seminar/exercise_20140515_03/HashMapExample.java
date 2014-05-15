package jp.co.jjs.java_seminar.exercise_20140515_03;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("abc", 123);
        map.put("def", 456);
        map.put("ghi", 789);

        System.out.println(map);
        System.out.println(map.keySet()); // すべてのキーを表示
        System.out.println(map.values()); // すべての値を表示
        System.out.println(map.get("def"));
        System.out.println(map.size());

    }
}
