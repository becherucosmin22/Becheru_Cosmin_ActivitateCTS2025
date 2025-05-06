package Observer.Stocks;

public interface StockObserver {
    void update(String symbol, double price);
}