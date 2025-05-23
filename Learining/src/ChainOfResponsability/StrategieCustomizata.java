package ChainOfResponsability;

class StrategieCustomizata implements IStrategieRetragere {
    private IBancnote handler;
    public StrategieCustomizata() {
        Handler50Lei h50 = new Handler50Lei();
        Handler10Lei h10 = new Handler10Lei();
        h50.setUrmator(h10);
        this.handler = h50;
    }
    public void retrage(int suma) throws Exception {
        System.out.println("[Strategie Customizata - doar 50 si 10]");
        handler.retrage(suma);
    }
}