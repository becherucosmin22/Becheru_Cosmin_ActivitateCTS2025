package Factory.Contract;

public class Vanzare extends Contract {
    public Vanzare(int nrPagini, String descriere) {
        super(nrPagini, descriere);
    }

    @Override
    public void detalii() {
        System.out.println("Contractul de vanzare are " + this.getNrPagini() + " pagini si are urmatorul continut: "+ this.getDescription() ) ;
    }}
