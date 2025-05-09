public class ProductWarehouse extends Warehouse {
    private String productName;

    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }

    public String getName() {
        return this.productName;
    }

    public void setName(String newName) {
        this.productName = newName;
    }

    @Override
    public String toString() {
        return this.getName() + ": " + super.toString();
    }

    public static void main(String[] args) {
//        //Part 1
//        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
//        juice.addToWarehouse(1000.0);
//        juice.takeFromWarehouse(11.3);
//        System.out.println(juice.getName()); // Juice
//        System.out.println(juice);

        //Part 2
        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName()); // Juice
        juice.addToWarehouse(1.0);
        System.out.println(juice);
    }
}
