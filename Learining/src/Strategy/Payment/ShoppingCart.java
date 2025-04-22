package Strategy.Payment;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Double> items = new ArrayList<>();
    private PaymentStrategy paymentStrategy;

    // Adaugă un produs cu preţul specificat
    public void addItem(double price) {
        items.add(price);
    }

    // Setează strategia de plată
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    // Calculează totalul şi procesează plata
    public void checkout() {
        double total = items.stream().mapToDouble(Double::doubleValue).sum();
        if (paymentStrategy == null) {
            throw new IllegalStateException("Trebuie să setezi o strategie de plată înainte de checkout!");
        }
        paymentStrategy.pay(total);
    }
}
