package ChainOfResponsability;

class Handler50Lei implements IBancnote {
    private IBancnote urmator;
    public void retrage(int suma) throws Exception {
        int nr = suma / 50;
        int rest = suma % 50;
        if (nr > 0) System.out.println("50 RON x " + nr);
        if (rest > 0) {
            if (urmator != null)
                urmator.retrage(rest);
            else
                throw new Exception("Nu pot retrage suma: " + suma);
        }
    }
    public void setUrmator(IBancnote urmator) {
        this.urmator = urmator;
    }
}