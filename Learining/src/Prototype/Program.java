package Prototype;

public class Program {
    public static void main(String[] args) {
        // Creăm biblioteca originală și adăugăm cărți
        Library originalLibrary = new Library("City Library");
        originalLibrary.addBook(new Book("Book A", "Author A", 2000));
        originalLibrary.addBook(new Book("Book B", "Author B", 2005));

        // Realizăm un shallow copy și un deep copy
        Library shallowCopyLibrary = originalLibrary.shallowCopy();
        Library deepCopyLibrary = originalLibrary.deepCopy();

        System.out.println("Before modification:");
        System.out.println("Original Library: " + originalLibrary);
        System.out.println("Shallow Copy Library: " + shallowCopyLibrary);
        System.out.println("Deep Copy Library: " + deepCopyLibrary);

        // Modificăm titlul primei cărți în biblioteca originală
        originalLibrary.getBooks().get(0).setTitle("Modified Book A");

        System.out.println("\nAfter modification:");
        System.out.println("Original Library: " + originalLibrary);
        System.out.println("Shallow Copy Library: " + shallowCopyLibrary); // Va reflecta modificarea
        System.out.println("Deep Copy Library: " + deepCopyLibrary);       // Rămâne neschimbată
    }
}
