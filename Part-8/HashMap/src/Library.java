import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private HashMap<String, Book> directory;

    public Library() {
        this.directory = new HashMap<>();
    }

    public void addBok(Book book) {
        String bookName = book.getName();
        if (bookName == null) {
            bookName = "";
        }

        bookName = bookName.toLowerCase().trim();

        if (this.directory.containsKey(bookName)) {
            System.out.println("Book already in library");
        } else {
            this.directory.put(bookName, book);
        }
    }

    public Book getBook(String bookName) {
        bookName = bookName.toLowerCase().trim();

        return this.directory.get(bookName);
    }

    public void removeBook(String bookName) {
        bookName = bookName.toLowerCase().trim();

        if (this.directory.containsKey(bookName)) {
            this.directory.remove(bookName);
        } else {
            System.out.println("Book was not found!");
        }
    }

    public void keySetPrint() {
        for (String key : this.directory.keySet()) {
            System.out.println(key);
        }
    }

    //finding out all the books by part of the name
    //using hashmap.keySet()
    public ArrayList<Book> getBookByPart(String part) {
        part = part.toLowerCase().trim();

        ArrayList<Book> books = new ArrayList<>();

        for (String keys : this.directory.keySet()) {
            if (!(keys.contains(part))) {
                continue;
            }
            books.add(this.directory.get(keys));
        }
        return books;
    }

    //finding out all books by part
    //using hashmap.values()
    public ArrayList<Book> getBookByPart2(String part) {
        part = part.toLowerCase().trim();

        ArrayList<Book> books = new ArrayList<>();

        for (Book book : this.directory.values()) {
            if (!(book.getName().contains(part))) {
                continue;
            }
            books.add(book);
        }
        return books;
    }
}
