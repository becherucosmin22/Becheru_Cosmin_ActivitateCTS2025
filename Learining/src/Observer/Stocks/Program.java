package Observer.Stocks;

public class Program {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Investor invAlice = new Investor("Alice");
        Investor invBob   = new Investor("Bob");
        BrokerDashboard dashboard = new BrokerDashboard();

        // Înregistrăm observatorii
        market.registerObserver(invAlice);
        market.registerObserver(invBob);
        market.registerObserver(dashboard);

        // Simulăm schimbări de preț
        market.setStockPrice("AAPL", 150.25);
        market.setStockPrice("GOOG", 2730.50);

        // Bob nu mai vrea notificări pentru moment
        market.removeObserver(invBob);

        market.setStockPrice("AAPL", 151.00);
    }
}