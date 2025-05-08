import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");

        Library library = new Library();
        library.addBok(senseAndSensibility);
        library.addBok(prideAndPrejudice);

        System.out.println(library.getBook("SenSe and SensibiliTy"));
    }
}