import java.util.ArrayList;
import java.util.List;

public class Printer {

    public void printManyTimes(Object object, int times) {
        int i = 0;

        while (i < times) {
            System.out.println(object.toString());
            i++;
        }
    }

    //String implements java.io.Serializable, Comparable<String>, CharSequence

    public void printCharacters(CharSequence  charSequence) {
        int i = 0;
        while (i < charSequence.length()) {
            System.out.println(charSequence.charAt(i));
            i++;
        }
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        String string = "words";
        List<String> words = new ArrayList<>();
        words.add("polymorphism");
        words.add("inheritance");
        words.add("encapsulation");
        words.add("abstraction");

        printer.printManyTimes(string,2);
        printer.printManyTimes(words,3);

        printer.printCharacters(string);
    }
}
