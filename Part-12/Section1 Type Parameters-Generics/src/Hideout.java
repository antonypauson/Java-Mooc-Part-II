public class Hideout<T> {

    private T hidden;

    public void putIntoHideout(T toHide) {
        hidden = toHide;
    }

    public T takeFromHideout() {
        if (this.hidden == null) {
            return null;
        }
        T hidden = this.hidden;
        this.hidden = null;
        return hidden;
    }

    public boolean isInHideout() {
        if (this.hidden == null) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {


        Hideout<Integer> den = new Hideout<>();
        System.out.println(den.isInHideout());
        den.putIntoHideout(1);
        System.out.println(den.isInHideout());
        System.out.println(den.isInHideout());
        System.out.println(den.takeFromHideout());
        System.out.println(den.isInHideout());

    }
}
