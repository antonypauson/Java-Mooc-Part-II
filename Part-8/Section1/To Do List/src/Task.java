public class Task {
    private String taskName;
    private int taskNum;

    public Task(String taskName, int taskNum) {
        this.taskName = taskName;
        this.taskNum = taskNum;
    }

    @Override
    public String toString() {
        return this.taskNum + ": " + this.taskName + "\n";
    }

    public int getTaskNum() {
        return this.taskNum;
    }
}
