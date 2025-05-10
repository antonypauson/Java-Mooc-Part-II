import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{
    private List<Movable> movables;

    public Herd() {
        this.movables = new ArrayList<>();
    }

    @Override
    public String toString() {
        String output = "";
        for (Movable movable : movables) {
            output += movable.toString();
        }
        return output;
    }

    public void addToHerd(Movable movable) {
        this.movables.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : movables) {
            movable.move(dx,dy);
        }
    }

    public static void main(String[] args) {
        Herd herd = new Herd();
        herd.addToHerd(new Organism(57, 66));
        herd.addToHerd(new Organism(73, 56));
        herd.addToHerd(new Organism(46, 52));
        herd.addToHerd(new Organism(19, 107));
        System.out.println(herd);
    }
}
