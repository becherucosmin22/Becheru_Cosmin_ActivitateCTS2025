package Observer.Stocks;

import java.util.List;
import java.util.ArrayList;

public class StockMarket implements StockSubject {
    private List<StockObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(StockObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(StockObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String symbol, double price) {
        for (StockObserver o : observers) {
            o.update(symbol, price);
        }
    }

    // Metodă apelată când prețul unei acțiuni se schimbă
    public void setStockPrice(String symbol, double price) {
        System.out.println("=== StockMarket: " + symbol + " changed to " + price + " ===");
        notifyObservers(symbol, price);
    }
}