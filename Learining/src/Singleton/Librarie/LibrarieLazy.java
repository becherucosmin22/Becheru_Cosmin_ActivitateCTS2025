package Singleton.Librarie;

public class LibrarieLazy {
    private String nume;
    private String locatie;
    private int codFiscal;

    // Varianta Lazy: instanța e inițializată doar la nevoie.
    private static LibrarieLazy instanta;

    private LibrarieLazy() {
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

    // Metodă statică pentru a obține instanța unică.
    // Dacă instanța nu există, o creăm la prima apelare.
    public static LibrarieLazy getInstanta() {
        if (instanta == null) {
            instanta = new LibrarieLazy();
        }
        return instanta;
    }
}
