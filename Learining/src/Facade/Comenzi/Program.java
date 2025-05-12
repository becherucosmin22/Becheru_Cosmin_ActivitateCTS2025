package Facade.Comenzi;

// Client.java
public class Program {
    public static void main(String[] args) {
        ComandaFacade comandaFacade = new ComandaFacade();
        comandaFacade.plaseazaComanda("Laptop", 1, "1234-5678-9012-3456", "Str. Exemplu, Nr. 10", "client@exemplu.com", "07xxxxxxxx");
        System.out.println("\n--- O altă comandă ---");
        comandaFacade.plaseazaComanda("Mouse", 2, "9876-5432-1098-7654", "Bd. Test, Nr. 5", "altclient@test.ro", "07yyyyyyyy");
    }
}