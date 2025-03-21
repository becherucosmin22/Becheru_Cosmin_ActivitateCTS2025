package Singleton.Problema1;

public class Masa {
    private int id;
    private boolean ocupata;

    public Masa(int id, boolean ocupata) {
        this.id = id;
        this.ocupata = ocupata;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isOcupata() {
        return ocupata;
    }

    public void setOcupata(boolean ocupata) {
        this.ocupata = ocupata;
    }
}
