import java.util.ArrayList;

public class Tasks {
    private ArrayList<Task> tasks;

    public Tasks() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task, int count) {
        Task newTask = new Task(task, count);
        tasks.add(newTask);
    }

    @Override
    public String toString() {
        String output = "";
        for (Task task : tasks) {
            output += task.toString();
        }
        return output;
    }

    public void getTask(int taskNum) {
        Task removeTask = null;
        for (Task task : tasks) {
            if (task.getTaskNum() == taskNum) {
                System.out.println(task);
                removeTask = task;
            }
        }
        this.tasks.remove(removeTask);
    }
}
