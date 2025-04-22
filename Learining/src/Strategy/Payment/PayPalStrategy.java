package Strategy.Payment;

// Plată prin PayPal
public class PayPalStrategy implements PaymentStrategy {
    private String email;
    private String password;

    public PayPalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        // aici ar fi integrarea reală cu API-ul PayPal
        System.out.println("Plata de " + amount + " lei realizată prin PayPal (cont: " + email + ")");
    }
}
