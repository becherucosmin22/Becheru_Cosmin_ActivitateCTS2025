package Factory.Coffee;

public class Latte implements Coffee {
    @Override
    public void brew() {
        System.out.println("Prepar un latte cu spumă de lapte.");
    }

    @Override
    public String getDescription() {
        return "Latte cremos";
    }

    @Override
    public double getCost() {
        return 3.5;
    }
}
