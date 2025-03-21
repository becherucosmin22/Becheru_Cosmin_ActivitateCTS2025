package Singleton.Problema1;

public class Program {
    public static void main(String[] args) {
        // Obține instanța singleton a restaurantului
        Restaurant restaurant = Restaurant.getInstance();

        // Afișează starea inițială a meselor
        System.out.println("Starea inițială a meselor:");
        restaurant.afiseazaMese();

        // Test: Ocuparea mesei cu id-ul 5
        int idMasa = 5;
        System.out.println("\nSe încearcă ocuparea mesei cu id " + idMasa + "...\n");
        restaurant.ocupaMasa(idMasa);
        restaurant.ocupaMasa(idMasa);
        // Afișează starea meselor după ocupare
        System.out.println("\nStarea meselor după ocuparea mesei " + idMasa + ":");
        restaurant.afiseazaMese();

        // Test: Eliberarea mesei cu id-ul 5
        System.out.println("\nSe încearcă eliberarea mesei cu id " + idMasa + "...\n");
        restaurant.elibereazaMasa(idMasa);

        // Afișează starea finală a meselor
        System.out.println("\nStarea finală a meselor:");
        restaurant.afiseazaMese();
    }
}
