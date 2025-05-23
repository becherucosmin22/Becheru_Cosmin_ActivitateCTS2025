package ChainOfResponsability;

public class Client implements IClient {
    private IStrategieRetragere strategie;
    public void setStrategie(IStrategieRetragere strategie) {
        this.strategie = strategie;
    }
    public void retrageBani(int suma) {
        try {
            strategie.retrage(suma);
        } catch (Exception e) {
            System.out.println("Eroare: " + e.getMessage());
        }
        System.out.println("------------");
    }
}