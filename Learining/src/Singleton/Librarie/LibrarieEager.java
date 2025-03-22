package Singleton.Librarie;

public class LibrarieEager {
    private String nume;
    private String locatie;
    private int codFiscal;

    private static final LibrarieEager instanta = new LibrarieEager();

    private LibrarieEager() {
        this.nume = "BookHeaven";
        this.locatie = "Bd. Libertatii Nr. 12";
        this.codFiscal = 654321;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public int getCodFiscal() {
        return codFiscal;
    }

    public void setCodFiscal(int codFiscal) {
        this.codFiscal = codFiscal;
    }

    public static LibrarieEager getInstanta() {
        return instanta;
    }
}
