import java.util.*;

public class Main {
    //related to Book Class
    //Literature exercise
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        int count = 0;
        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String bookName = scanner.nextLine();

            if (bookName.isEmpty()) {
                break;
            }

            System.out.println("Input the age recommendation:");
            int ageRecom = Integer.parseInt(scanner.nextLine());
            books.add(new Book(bookName, ageRecom));
            count++;
        }
        System.out.println(count + " books in total\nBooks:\n");
        books.stream()
                .forEach(book -> System.out.println(book));
        //display them in order of age
        System.out.println("Ordered based on age:");
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge);
        Collections.sort(books, comparator);
        books.stream()
                .forEach(book -> System.out.println(book));
        //display them based on age and name
        System.out.println("Ordered based on age + name:");
        Comparator<Book> comparator1 = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);
        Collections.sort(books,comparator1);
        books.stream()
                .forEach(book -> System.out.println(book));

    }
}