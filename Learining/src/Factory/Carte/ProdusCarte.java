package Factory.Carte;

public abstract class ProdusCarte {

    private String titlu;
    private int nrPagini;
    private float pret;
    private String autor;

    public ProdusCarte(String titlu, int nrPagini, float pret, String autor) {
        this.titlu = titlu;
        this.nrPagini = nrPagini;
        this.pret = pret;
        this.autor = autor;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public int getNrPagini() {
        return nrPagini;
    }

    public void setNrPagini(int nrPagini) {
        this.nrPagini = nrPagini;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Metodă abstractă pentru descrierea produsului (carții)
    public abstract void afiseazaDescriere();
}