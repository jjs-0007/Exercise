package jp.co.jjs.java_seminar.exercise_20140516_01;

import java.util.ArrayList;

public class TaskList {

    ArrayList<Task> taskList = new ArrayList<>();

    public void add(Task task) {
        taskList.add(task);
    }

    public void showAll() {
        for (Task task : taskList) {

            System.out.printf("%s%s\n", task.getlabel(),
                    task.getfinish() ? "(DONE)" : "");
        }
    }

}
