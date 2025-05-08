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




}
