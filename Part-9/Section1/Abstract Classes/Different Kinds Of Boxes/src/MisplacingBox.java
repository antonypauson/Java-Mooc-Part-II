import java.util.ArrayList;

public class MisplacingBox extends Box{
    private ArrayList<Item> items;

    public MisplacingBox() {
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        items.add(item);
    }

    @Override
    public boolean IsInBox(Item item) {
        return false;
    }

    public static void main(String[] args) {
        MisplacingBox box = new MisplacingBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.IsInBox(new Item("Saludo")));
        System.out.println(box.IsInBox(new Item("Pirkka")));
    }
}
