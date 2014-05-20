package jp.co.jjs.java_seminar.exercise_20140516_01;

public class Task {

    private String label; // 内容
    private boolean finish; // 状態

    public Task(String label) {
        this.label = label;
    }

    public String getlabel() {
        return label;
    }

    public void finish() {
        this.finish = true;
    }

    public boolean getfinish() {
        return finish;
    }

}