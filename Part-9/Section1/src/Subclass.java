public class Subclass extends Superclass {

    public Subclass() {
        super("Subclass");
    }

    @Override
    public String toString() {
        return super.toString() + "\n And lets add my own message to it";
    }
}
