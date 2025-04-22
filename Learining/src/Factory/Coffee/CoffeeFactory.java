package Factory.Coffee;

public class CoffeeFactory {

    public static Coffee createCoffee(String type) {
        switch (type.toLowerCase()) {
            case "espresso":
                return new Espresso();
            case "latte":
                return new Latte();
            case "cappuccino":
                return new Cappuccino();
            case "mocha":
                return new Mocha();
            default:
                throw new IllegalArgumentException("Tip de cafea necunoscut: " + type);
        }
    }
}
