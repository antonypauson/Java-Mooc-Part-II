import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }

    public void add(Item item) {
        if (this.capacity > 0) {
            this.capacity -= item.getWeight();
            items.add(item);
        }
    }

    @Override
    public boolean IsInBox(Item item) {
        return this.items.contains(item);
    }

    public static void main(String[] args) {
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        coffeeBox.add(new Item("Saludo", 5));
        coffeeBox.add(new Item("Pirkka", 5));
        coffeeBox.add(new Item("Kopi Luwak", 5));

        System.out.println(coffeeBox.IsInBox(new Item("Saludo")));
        System.out.println(coffeeBox.IsInBox(new Item("Pirkka")));
        System.out.println(coffeeBox.IsInBox(new Item("Kopi Luwak")));
    }
}
