import java.util.ArrayList;
import java.util.HashMap;

public class TaskTracker {
    private HashMap<String, ArrayList<Integer>> completedExercises;

    public TaskTracker() {
        this.completedExercises = new HashMap<>();
    }

    public void add(String user, int exercise) {
        this.completedExercises.putIfAbsent(user, new ArrayList<>());

        this.completedExercises.get(user).add(exercise);
    }

    public void print() {
        for (String name : this.completedExercises.keySet()) {
            System.out.println(name + ": " + this.completedExercises.get(name));
        }
    }
}
