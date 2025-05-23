package ChainOfResponsability;

class Handler10Lei implements IBancnote {
    private IBancnote urmator;
    public void retrage(int suma) throws Exception {
        int nr = suma / 10;
        int rest = suma % 10;
        if (nr > 0) System.out.println("10 RON x " + nr);
        if (rest > 0)
            throw new Exception("Nu pot retrage suma exacta: " + suma);
    }
    public void setUrmator(IBancnote urmator) {
        this.urmator = urmator;
    }
}