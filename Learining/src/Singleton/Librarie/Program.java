package Singleton.Librarie;

public class Program {
    public static void main(String[] args) {
        // Test LibrarieLazy
        LibrarieLazy lazyInstance1 = LibrarieLazy.getInstanta();
        LibrarieLazy lazyInstance2 = LibrarieLazy.getInstanta();
        System.out.println("LibrarieLazy: " + (lazyInstance1 == lazyInstance2)); // Should print true

        // Test LibrarieEager
        LibrarieEager eagerInstance1 = LibrarieEager.getInstanta();
        LibrarieEager eagerInstance2 = LibrarieEager.getInstanta();
        System.out.println("LibrarieEager: " + (eagerInstance1 == eagerInstance2)); // Should print true

        // Test LibrarieThreadSafe
        LibrarieThreadSafe threadSafeInstance1 = LibrarieThreadSafe.getInstanta();
        LibrarieThreadSafe threadSafeInstance2 = LibrarieThreadSafe.getInstanta();
        System.out.println("LibrarieThreadSafe: " + (threadSafeInstance1 == threadSafeInstance2)); // Should print true
    }
}