package Facade.Comenzi;

class ComandaFacade {
    private Inventar inventar;
    private Plata plata;
    private Livrare livrare;
    private Notificare notificare;

    public ComandaFacade() {
        this.inventar = new Inventar();
        this.plata = new Plata();
        this.livrare = new Livrare();
        this.notificare = new Notificare();
    }

    public void plaseazaComanda(String produs, int cantitate, String card, String adresa, String emailClient, String telefonClient) {
        if (inventar.verificaDisponibilitate(produs, cantitate)) {
            double pret = getPretProdus(produs); // Simulare: obținere preț
            if (plata.proceseazaPlata(card, pret * cantitate)) {
                inventar.actualizeazaInventar(produs, cantitate);
                livrare.planificaLivrare(adresa, produs);
                notificare.trimiteEmail(emailClient, "Comanda ta pentru " + cantitate + " x " + produs + " a fost plasată cu succes!");
                notificare.trimiteSMS(telefonClient, "Comanda ta a fost plasată cu succes. Detalii pe email.");
                System.out.println("Comanda plasată cu succes!");
            } else {
                System.out.println("Plata a eșuat.");
            }
        } else {
            System.out.println("Produsul " + produs + " nu este disponibil în cantitatea dorită.");
        }
    }

    private double getPretProdus(String produs) {
        if (produs.equals("Laptop")) {
            return 1200.0;
        } else if (produs.equals("Mouse")) {
            return 25.0;
        }
        return 0.0;
    }
}