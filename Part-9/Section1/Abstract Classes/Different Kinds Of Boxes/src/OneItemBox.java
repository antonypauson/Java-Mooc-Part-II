import java.lang.reflect.Array;
import java.util.ArrayList;

public class OneItemBox extends Box {

    private int capacity;
    private ArrayList<Item> items;

    public OneItemBox() {
        items = new ArrayList<>();
         this.capacity = 0;
    }

    @Override
    public boolean IsInBox(Item item) {
        return items.contains(item);
    }

    @Override
    public void add(Item item) {
        if (this.capacity == 0) {
            this.items.add(item);
            capacity++;
        }
    }

    public static void main(String[] args) {
        OneItemBox box = new OneItemBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.IsInBox(new Item("Saludo")));
        System.out.println(box.IsInBox(new Item("Pirkka")));
    }
}
