public class LicensePlate {
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LicensePlate)) {
            return false;
        }

        LicensePlate objPlate = (LicensePlate) obj;
        if (this.country.equals(objPlate.country) &&
        this.liNumber.equals(objPlate.liNumber)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.liNumber.hashCode() +
                this.country.hashCode();
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }
}
