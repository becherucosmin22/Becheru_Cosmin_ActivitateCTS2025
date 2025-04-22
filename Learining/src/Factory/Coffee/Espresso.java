package Factory.Coffee;

public class Espresso implements Coffee {
    @Override
    public void brew() {
        System.out.println("Prepar un espresso tare, sub presiune.");
    }

    @Override
    public String getDescription() {
        return "Espresso simplu";
    }

    @Override
    public double getCost() {
        return 2.0;
    }
}
