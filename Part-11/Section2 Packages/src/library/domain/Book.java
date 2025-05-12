package library.domain;

public class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static class Program {
        public static void main(String[] args) {
    //        System.out.println("Hello packageworld!");
            Book book = new Book("the ABCs of packages");
            System.out.println("Hello package world " + book.getName());
        }

    }
}
