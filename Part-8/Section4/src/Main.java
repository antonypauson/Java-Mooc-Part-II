import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

//        HashMap<String, ArrayList<String>> phoneNumbers = new HashMap<>();
//
//        phoneNumbers.put("Pekka", new ArrayList<>());
//        phoneNumbers.get("Pekka").add("040-12348765");
//        phoneNumbers.get("Pekka").add("09-111333");
//
//        System.out.println("Pekka's numbers: " + phoneNumbers.get("Pekka"));

        TaskTracker tracker = new TaskTracker();
        tracker.add("Ada", 3);
        tracker.add("Ada", 4);
        tracker.add("Ada", 3);
        tracker.add("Ada", 3);

        tracker.add("Pekka", 4);
        tracker.add("Pekka", 4);

        tracker.add("Matti", 1);
        tracker.add("Matti", 2);

        tracker.print();
    }
}