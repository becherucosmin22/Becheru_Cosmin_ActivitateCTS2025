package Proxy.Image;

public class Program {
    public static void main(String[] args) {
        Image image = new ProxyImage("photo1.jpg");

        // prima dată se încarcă de pe disc
        image.display();
        System.out.println();

        // a doua oară folosește obiectul deja încărcat, fără IO
        image.display();
    }
}