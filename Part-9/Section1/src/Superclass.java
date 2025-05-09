public class Superclass {
    private String objectVariable;

    public Superclass(String value) {
        this.objectVariable = value;
    }

    public Superclass() {
        this("Example");
    }

    public String toString() {
        return this.objectVariable;
    }
}
