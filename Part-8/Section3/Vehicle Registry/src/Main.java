import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
//        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
//        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
//        finnishPlates.add(li1);
//        finnishPlates.add(li2);

        LicensePlate newLi = new LicensePlate("FI", "ABC-123");
        if (!finnishPlates.contains(newLi)) {
            finnishPlates.add(newLi);
        }
        System.out.println("finnish: " + finnishPlates);

        HashMap<LicensePlate, String> owners = new HashMap<>();
//        owners.put(li1, "Arto");
//        owners.put(li3, "Jürgen");

        System.out.println("owners:");
        System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
        System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));

        //Part 2 and 3
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");
        LicensePlate li4 = new LicensePlate("FI", "ZZZ-999");

        // Initialize VehicleRegistry
        VehicleRegistry registry = new VehicleRegistry();

        // Add plates
        System.out.println("Adding plates:");
        System.out.println("li1 added: " + registry.add(li1, "Arto"));    // should be true
        System.out.println("li2 added: " + registry.add(li2, "Pekka"));   // should be true
        System.out.println("li3 added: " + registry.add(li3, "Jürgen"));  // should be true
        System.out.println("li1 again: " + registry.add(li1, "Someone")); // should be false

        // Get owners
        System.out.println("\nGetting owners:");
        System.out.println("Owner of li1: " + registry.get(li1)); // Arto
        System.out.println("Owner of li4 (not added): " + registry.get(li4)); // null

        // Remove a plate
        System.out.println("\nRemoving plates:");
        System.out.println("li2 removed: " + registry.remove(li2)); // true
        System.out.println("li2 removed again: " + registry.remove(li2)); // false

        // Print all license plates
        System.out.println("\nLicense plates in registry:");
        registry.printLicensePlates();

        // Add duplicate owner
        registry.add(li4, "Arto"); // Arto owns another car

        // Print unique owners
        System.out.println("\nUnique owners in registry:");
        registry.printOwners();
    }
}