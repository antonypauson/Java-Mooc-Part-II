import java.util.ArrayList;
import java.util.Collections;

public class Person {

    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Ada Lovelace", 1815));
        persons.add(new Person("Irma Wyman", 1928));
        persons.add(new Person("Grace Hopper", 1906));
        persons.add(new Person("Mary Coombs", 1929));

        persons.stream().forEach(p -> System.out.println(p.getName()));
        System.out.println();

        persons.stream().sorted((p1, p2) -> {
            return p1.getBirthYear() - p2.getBirthYear();
        }).forEach(p -> System.out.println(p.getName()));
        System.out.println();

        Collections.sort(persons, (p1, p2) -> p1.getBirthYear() - p2.getBirthYear());
        persons.stream().forEach(p -> System.out.println(p.getName()));
        System.out.println();

        persons.stream().sorted((p1, p2) -> {
            return p1.getName().compareTo(p2.getName());
        }).forEach(p -> System.out.println(p.getName()));
    }
}
