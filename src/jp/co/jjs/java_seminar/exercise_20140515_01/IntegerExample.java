package jp.co.jjs.java_seminar.exercise_20140515_01;

public class IntegerExample {
    public static void main(String[] args) {
        String s = "125";
        Integer obj = Integer.valueOf(s);
        int i = obj.intValue();
        i += 10;
        System.out.println(i);

        String d = "19";
        Integer integer = Integer.valueOf(d);
        int num = integer.intValue();
        num += 100;
        System.out.println(num);
        
        String str = Integer.toHexString(num);
        System.out.println(str);

    }

}
