import java.util.Random;

public class Locker<T>{

    private T element;

    public void setValue(T element) {
        this.element = element;
    }

    public T getValue() {
        return element;
    }

    public static void main(String[] args) {
        Locker<Integer> intGeneric= new Locker<>();
        intGeneric.setValue(5);
        System.out.println(intGeneric.getValue());

        Locker<String> strGeneric = new Locker<>();
        strGeneric.setValue("wow");
        System.out.println(strGeneric.getValue());
        
        Locker<Random> randGeneric = new Locker<>();
        randGeneric.setValue(new Random());
        System.out.println(randGeneric.getValue().nextDouble());
    }
}
