import java.util.ArrayList;

public class Ebook implements Readable {

    private String name;
    private ArrayList<String> pages;
    private int pageNumber;

    public Ebook(String name, ArrayList<String> pages) {
        this.name = name;
        this.pages = pages;
        this.pageNumber = 0;
    }

    public int pages() {
        return this.pages.size();
    }

    public String getName() {
        return this.name;
    }

    public String read() {
        String page = this.pages.get(this.pageNumber);
        this.nextPage();
        return page;
    }

    public void nextPage() {
        this.pageNumber = this.pageNumber + 1;
        if (this.pageNumber % this.pages.size() == 0) {
            this.pageNumber = 0;
        }
    }

    public static void main(String[] args) {
        ArrayList<String> pages = new ArrayList<>();

        pages.add("Split your method into short, readable entities.");
        pages.add("Separate the user-interface logic from the application logic.");
        pages.add("Always program a small part initially that solves a part of the problem.");
        pages.add("Practice makes the master. Try different out things for yourself and work on your own projects.");

        Ebook book = new Ebook("Tips for programming", pages);
        int page = 0;
        while (page < book.pages()) {
            System.out.println(book.read());
            page++;
        }
    }

}
