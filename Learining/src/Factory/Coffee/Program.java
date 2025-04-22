package Factory.Coffee;

public class Program {
    public static void main(String[] args) {
        // Clientul comandă două cafele diferite:
        Coffee order1 = CoffeeFactory.createCoffee("espresso");
        Coffee order2 = CoffeeFactory.createCoffee("mocha");

        // Barista pregăteşte şi serveşte comenzile:
        System.out.println("Comanda 1: " + order1.getDescription() + " — Preţ: " + order1.getCost() + "€");
        order1.brew();

        System.out.println();

        System.out.println("Comanda 2: " + order2.getDescription() + " — Preţ: " + order2.getCost() + "€");
        order2.brew();
    }
}
