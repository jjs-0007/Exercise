package jp.co.jjs.java_seminar.exercise_20140515_02;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("abc");
        list.add("def");
        list.add("ghi");
        
        list.remove(0);
        
        for (String str: list) {
            System.out.println(str);
            
        }
        
        System.out.println(list.size());
        System.out.println(list.toString());
    }
    

}
