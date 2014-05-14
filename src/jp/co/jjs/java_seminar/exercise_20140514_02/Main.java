package jp.co.jjs.java_seminar.exercise_20140514_02;

public class Main {
    public static void main(String[] args) {
        
        Student name1 = new Student("yokoyama");
        Student name2 = new Student("naoto");
        
        name1.answerinc();
        name1.answerinc();
        name2.report();
        
        System.out.println(name1.name);
        System.out.println(name2.name);
        System.out.println(name1.answercount);
        System.out.println(name1.report());
        
    }

}
