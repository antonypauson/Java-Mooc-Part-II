package library;

import library.domain.Book;

public class Program {
    public static void main(String[] args) {
//        System.out.println("Hello packageworld!");
        Book book = new Book("the ABCs of packages");
        System.out.println("Hello package world " + book.getName());
    }

}
