import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehicleRegistery;

    public VehicleRegistry() {
        this.vehicleRegistery = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.vehicleRegistery.get(licensePlate) == null) {
            this.vehicleRegistery.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        if (this.vehicleRegistery.containsKey(licensePlate)) {
            return this.vehicleRegistery.get(licensePlate);
        }
        return null;
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.vehicleRegistery.containsKey(licensePlate)) {
            this.vehicleRegistery.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate plates : this.vehicleRegistery.keySet()) {
            System.out.println(plates);
        }
    }

    public void printOwners() {
        ArrayList<String> uniqueOwners = new ArrayList<>();
        for (String owner : this.vehicleRegistery.values()) {
            if (uniqueOwners.contains(owner)) {
                continue;
            }
            uniqueOwners.add(owner);
        }

        for (String owner : uniqueOwners) {
            System.out.println(owner);
        }
    }
}
