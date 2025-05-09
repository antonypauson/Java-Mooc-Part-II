import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> changes;

    public ChangeHistory() {
        this.changes = new ArrayList<>();
    }

    public void add(double status) {
        this.changes.add(status);
    }

    public void clear() {
        this.changes.clear();
    }

    public double maxValue() {
        if (!this.changes.isEmpty()) {
            double largest = this.changes.get(0);
            for (Double change : changes) {
                if (largest < change) {
                    largest = change;
                }
            }
            return largest;
        }
        return 0;
    }

    public double minValue() {
        if (!this.changes.isEmpty()) {
            double smallest = this.changes.get(0);
            for (Double change : changes) {
                if (smallest > change) {
                    smallest = change;
                }
            }
            return smallest;
        }
        return 0;
    }

    public double average() {
        if (!this.changes.isEmpty()) {
            int count = 0;
            int sum = 0;
            for (Double change : changes) {
                count++;
                sum += change;
            }
            return (1.0 * sum) / count;
        }
        return 0;
    }

    @Override
    public String toString() {
        return this.changes.toString();
    }
}
