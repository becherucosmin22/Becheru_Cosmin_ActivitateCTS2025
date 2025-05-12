package Facade.Comenzi;


class Inventar {
    public boolean verificaDisponibilitate(String produs, int cantitate) {
        System.out.println("Inventar: Verifică disponibilitatea pentru " + produs + ", cantitate: " + cantitate);

        return cantitate <= 10;
    }

    public void actualizeazaInventar(String produs, int cantitate) {
        System.out.println("Inventar: Actualizează stocul pentru " + produs + ", cantitate: " + cantitate);
    }
}