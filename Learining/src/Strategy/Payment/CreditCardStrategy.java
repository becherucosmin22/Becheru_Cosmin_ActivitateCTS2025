package Strategy.Payment;

// Plată cu card
public class CreditCardStrategy implements PaymentStrategy {
    private String cardNumber;
    private String cardHolder;
    private String cvv;
    private String expiryDate;

    public CreditCardStrategy(String cardNumber, String cardHolder, String cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(double amount) {
        // aici ar fi integrarea reală cu un gateway
        System.out.println("Plata de " + amount + " lei realizată cu cardul " + cardNumber);
    }
}