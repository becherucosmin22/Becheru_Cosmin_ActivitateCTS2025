package Factory.Contract;

public class Inchiriere extends Contract {
    public Inchiriere(int nrPagini, String descriere) {
        super(nrPagini, descriere);
    }

    @Override
    public void detalii() {
        System.out.println("Contractul de inchiriere are " + this.getNrPagini() + " pagini si are urmatorul continut: "+ this.getDescription() ) ;
    }
}
