package Factory.Contract;

public abstract class Contract {
    private int nrPagini;
    private String description;

    public Contract(int nrPagini, String description) {
        this.nrPagini = nrPagini;
        this.description = description;
    }

    public int getNrPagini() {
        return nrPagini;
    }

    public void setNrPagini(int nrPagini) {
        this.nrPagini = nrPagini;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract void detalii();
}
