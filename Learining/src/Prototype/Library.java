package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Library implements Cloneable {
    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getName() {
        return name;
    }

    // Shallow copy: clonăm biblioteca, dar lista de cărți conține aceleași referințe
    public Library shallowCopy() {
        try {
            Library clonedLibrary = (Library) super.clone();
            // Clonăm lista, dar nu și obiectele din ea
            clonedLibrary.books = new ArrayList<>(this.books);
            return clonedLibrary;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    // Deep copy: clonăm biblioteca și fiecare carte din listă
    public Library deepCopy() {
        try {
            Library clonedLibrary = (Library) super.clone();
            clonedLibrary.books = new ArrayList<>();
            for (Book book : this.books) {
                clonedLibrary.books.add(book.clone());
            }
            return clonedLibrary;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}