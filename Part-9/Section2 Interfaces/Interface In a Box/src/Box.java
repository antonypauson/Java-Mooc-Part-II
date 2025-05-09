import java.util.ArrayList;

public class Box {
    private ArrayList<Packable> items;
    private double maxCap;

    public Box(int maxCap) {
        this.items = new ArrayList<>();
        this.maxCap = maxCap;
    }

    public void add(Packable packable) {
        if (this.maxCap - packable.weight() > 0) {
            this.items.add(packable);
            this.maxCap -= packable.weight();
        }
    }

    @Override
    public String toString() {
        int count = 0;
        double weight = 0;
        for (Packable packable : items) {
            count++;
            weight += packable.weight();
        }
        return "Box: " + count + " items, total weight "
                + weight + " kg";
    }

    public static void main(String[] args) {
        Box box = new Box(10);

        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        System.out.println(box);
    }
}
