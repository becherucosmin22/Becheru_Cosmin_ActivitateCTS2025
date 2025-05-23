package ChainOfResponsability;

class Handler20Lei implements IBancnote {
    private IBancnote urmator;
    public void retrage(int suma) throws Exception {
        int nr = suma / 20;
        int rest = suma % 20;
        if (nr > 0) System.out.println("20 RON x " + nr);
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