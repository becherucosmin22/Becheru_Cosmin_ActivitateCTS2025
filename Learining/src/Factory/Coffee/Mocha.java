package Factory.Coffee;

public class Mocha implements Coffee {
    @Override
    public void brew() {
        System.out.println("Prepar un mocha cu ciocolată.");
    }

    @Override
    public String getDescription() {
        return "Mocha cu ciocolată";
    }

    @Override
    public double getCost() {
        return 4.0;
    }
}
