package Factory.Coffee;

public class Cappuccino implements Coffee {
    @Override
    public void brew() {
        System.out.println("Prepar un cappuccino cu spumă densă.");
    }

    @Override
    public String getDescription() {
        return "Cappuccino clasic";
    }

    @Override
    public double getCost() {
        return 3.0;
    }
}
