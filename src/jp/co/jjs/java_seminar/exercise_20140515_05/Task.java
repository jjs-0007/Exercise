package jp.co.jjs.java_seminar.exercise_20140515_05;

public class Task {

    String label; // 内容
    boolean finish; // 状態

    public Task(String label) {
        this.label = label;

    }

    public void finish() {
        this.finish = true;
    }

}