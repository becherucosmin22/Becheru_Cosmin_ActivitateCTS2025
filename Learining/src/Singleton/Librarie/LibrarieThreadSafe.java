package Singleton.Librarie;

public class LibrarieThreadSafe {
    private String nume;
    private String locatie;
    private int codFiscal;

    // Varianta Thread-Safe: instanța e inițializată doar la nevoie și este thread-safe.
    private static LibrarieThreadSafe instanta;

    private LibrarieThreadSafe() {
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
    public static synchronized LibrarieThreadSafe getInstanta() {
        if (instanta == null) {
            instanta = new LibrarieThreadSafe();
        }
        return instanta;
    }
}