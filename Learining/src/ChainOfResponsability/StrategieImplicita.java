package ChainOfResponsability;

class StrategieImplicita implements IStrategieRetragere {
    private IBancnote handler;
    public StrategieImplicita(IBancnote handler) {
        this.handler = handler;
    }
    public void retrage(int suma) throws Exception {
        System.out.println("[Strategie Implicita]");
        handler.retrage(suma);
    }
}