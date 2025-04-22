package Strategy.Payment;

public class Program {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(120.0);
        cart.addItem(75.5);
        cart.addItem(45.0);

        // Clientul alege plata cu card
        cart.setPaymentStrategy(new CreditCardStrategy(
                "1234-5678-9012-3456", "Ion Popescu", "123", "12/26"
        ));
        cart.checkout();

        // Mai târziu, aceeaşi comandă, dar clientul vrea PayPal
        cart.setPaymentStrategy(new PayPalStrategy("ion@example.com", "parolaSecreta"));
        cart.checkout();
    }
}