package jp.co.jjs.java_seminar.exercise_20140514_02;

public class Student {

    String name; // 生徒の名前
    String time; // 出席した時間
    String id; // 生徒のID
    int answercount;

    boolean login; // 出席状態

    public Student(String name) {
        this.name = name;
    }
    
    public void answerinc() {
        this.answercount ++;
    }
    
    public String report() {
        return "演習問題を" + answercount + "解きました";
    }
}
