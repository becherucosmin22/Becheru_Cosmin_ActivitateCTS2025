package Facade.Comenzi;


class Plata {
    public boolean proceseazaPlata(String card, double suma) {
        System.out.println("Plata: Procesează plata de " + suma + " RON folosind cardul " + card);
        return true;
    }
}