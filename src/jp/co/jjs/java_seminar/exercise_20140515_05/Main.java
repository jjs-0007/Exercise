package jp.co.jjs.java_seminar.exercise_20140515_05;

public class Main {
    public static void main(String[] args) {

        TaskList taskList = new TaskList();

        Task task1 = new Task("髪を切る");
        Task task2 = new Task("買い物に行く");
        Task task3 = new Task("明日金曜日");

        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);

        task1.finish();
        task2.finish();

        taskList.showAll();

    }
}
