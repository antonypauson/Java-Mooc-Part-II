import java.util.ArrayList;

public class Box implements Packable{
    private ArrayList<Packable> items;
    private double maxCap;

    public Box(int maxCap) {
        this.items = new ArrayList<>();
        this.maxCap = maxCap;
    }

    public double weight() {
        double weight = 0;
        for (Packable packable : items) {
            weight += packable.weight();
        }
        return weight;
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
        for (Packable packable : items) {
            count++;
        }
        return "Box: " + count + " items, total weight "
                + this.weight() + " kg";
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

        //Boxes can contain other boxes
        //since Box is also a Packable interface;
        Box box1 = new Box(10);
        box.add(box1);

        Box box2 = new Box(10);
        box2.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box2.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box2.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));
        box.add(box2);
        System.out.println(box);
    }
}
