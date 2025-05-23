package ChainOfResponsability;

public class Program {
    public static void main(String[] args) {
        Handler50Lei h50 = new Handler50Lei();
        Handler20Lei h20 = new Handler20Lei();
        Handler10Lei h10 = new Handler10Lei();
        h50.setUrmator(h20);
        h20.setUrmator(h10);

        IClient client = new Client();

        client.setStrategie(new StrategieImplicita(h50));
        client.retrageBani(130);

        client.setStrategie(new StrategieCustomizata());
        client.retrageBani(130);

        client.setStrategie(new StrategieImplicita(h50));
        client.retrageBani(125);
    }
}
