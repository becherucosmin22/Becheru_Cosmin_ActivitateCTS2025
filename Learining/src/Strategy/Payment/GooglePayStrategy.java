package Strategy.Payment;

// Plată prin Google Pay
public class GooglePayStrategy implements PaymentStrategy {
    private String googleAccount;

    public GooglePayStrategy(String googleAccount) {
        this.googleAccount = googleAccount;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Plata de " + amount + " lei realizată prin Google Pay (cont: " + googleAccount + ")");
    }
}
