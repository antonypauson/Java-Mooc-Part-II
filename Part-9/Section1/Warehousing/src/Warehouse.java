public class Warehouse {
    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        if (capacity <= 0) {
            this.capacity = 0;
        } else {
            this.capacity = capacity;
        }
        this.balance = 0;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double howMuchSpaceLeft() {
        return this.capacity - this.balance;
    }

    public void addToWarehouse(double amount) {
        if (amount > 0) {
            if (amount + balance > capacity) {
                balance = capacity;
            } else {
                balance += amount;
            }
        }
    }

    public double takeFromWarehouse(double amount) {
        if (amount > 0) {
            if (balance < amount) {
                double taken = balance;
                balance = 0;
                return taken;
            } else {
                balance -= amount;
                return amount;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "balance = " + this.balance +
                ", space left " + (this.capacity - this.balance);
    }
}
