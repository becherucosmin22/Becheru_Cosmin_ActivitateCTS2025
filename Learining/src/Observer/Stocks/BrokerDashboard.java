package Observer.Stocks;

public class BrokerDashboard implements StockObserver {
    @Override
    public void update(String symbol, double price) {
        System.out.println("BrokerDashboard: update UI for "
                + symbol + " → " + price);
    }
}