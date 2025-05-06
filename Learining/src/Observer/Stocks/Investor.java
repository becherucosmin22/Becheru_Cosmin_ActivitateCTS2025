package Observer.Stocks;

public class Investor implements StockObserver {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String symbol, double price) {
        System.out.println("Investor " + name + " notified: "
                + symbol + " is now " + price);
    }
}