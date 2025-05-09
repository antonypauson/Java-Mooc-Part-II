import java.util.HashMap;
import java.util.Map;

public class ShoppingCarts {
    private Map<String, Item> itemMap;

    public ShoppingCarts() {
        this.itemMap = new HashMap<>();
    }

    public void add(String product, int price) {
        if (itemMap.containsKey(product)) {
            itemMap.get(product).increaseQuantity();
        } else {
            Item item = new Item(product, 1, price);
            itemMap.put(product, item);
        }

    }

    public void print() {
        for (Item items : itemMap.values()) {
            System.out.println(items);
        }
    }

    public int price() {
        int total = 0;
        for (Item items : itemMap.values()) {
            total += items.price();
        }
        return total;
    }

    public static void main(String[] args) {
//        ShoppingCarts cart = new ShoppingCarts();
//        cart.add("milk", 3);
//        cart.add("buttermilk", 2);
//        cart.add("cheese", 5);
//        System.out.println("cart price: " + cart.price());
//        cart.add("computer", 899);
//        System.out.println("cart price: " + cart.price());
//
//        cart.print();

        //Part 7
        ShoppingCarts cart = new ShoppingCarts();
        cart.add("milk", 3);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");

        cart.add("buttermilk", 2);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");

        cart.add("milk", 3);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");

        cart.add("milk", 3);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");
    }
}
