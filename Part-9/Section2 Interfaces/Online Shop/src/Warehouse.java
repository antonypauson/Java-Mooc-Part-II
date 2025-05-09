import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> productPrice;
    private Map<String, Integer> productStock;

    public Warehouse() {
        productPrice = new HashMap<>();
        productStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.productPrice.put(product, price);
        this.productStock.put(product, stock);
    }

    public int price(String product) {
        for (String products: this.productPrice.keySet()) {
            if (products.equals(product)) {
                return this.productPrice.get(product);
            }
        }
        return -99;
    }

    public Set<String> products() {
        return  this.productStock.keySet();
    }

    public int  stock(String product) {
        for (String products : this.productStock.keySet()) {
            if (products.equals(product)) {
                return this.productStock.get(products);
            }
        }
        return 0;
    }

    public boolean take(String product) {
        int currentStock = 0;
        for (String products : this.productStock.keySet()) {
            if (products.equals(product)) {
                currentStock = this.productStock.get(products);

                if (currentStock - 1 < 0) {
                    return false;
                } else {
                    currentStock--;
                    this.productStock.put(product, currentStock);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        //Part 1
//        Warehouse warehouse = new Warehouse();
//        warehouse.addProduct("milk", 3, 10);
//        warehouse.addProduct("coffee", 5, 7);
//
//        System.out.println("prices:");
//        System.out.println("milk: " + warehouse.price("milk"));
//        System.out.println("coffee: " + warehouse.price("coffee"));
//        System.out.println("sugar: " + warehouse.price("sugar"));

//        //Part 2
//        Warehouse warehouse = new Warehouse();
//        warehouse.addProduct("coffee", 5, 1);
//
//        System.out.println("stock:");
//        System.out.println("coffee:  " + warehouse.stock("coffee"));
//        System.out.println("sugar: " + warehouse.stock("sugar"));
//
//        System.out.println("taking coffee " + warehouse.take("coffee"));
//        System.out.println("taking coffee " + warehouse.take("coffee"));
//        System.out.println("taking sugar " + warehouse.take("sugar"));
//
//        System.out.println("stock:");
//        System.out.println("coffee:  " + warehouse.stock("coffee"));
//        System.out.println("sugar: " + warehouse.stock("sugar"));

        //Part 3
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("milk", 3, 10);
        warehouse.addProduct("coffee", 5, 6);
        warehouse.addProduct("buttermilk", 2, 20);
        warehouse.addProduct("yogurt", 2, 20);

        System.out.println("products:");

        for (String product: warehouse.products()) {
            System.out.println(product);
        }
    }
}
