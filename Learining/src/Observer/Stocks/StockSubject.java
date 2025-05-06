package Observer.Stocks;

public interface StockSubject {
    void registerObserver(StockObserver o);
    void removeObserver(StockObserver o);
    void notifyObservers(String symbol, double price);
}