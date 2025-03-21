package Singleton.Problema1;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Masa> mese;
    private static Restaurant instance;

    private Restaurant() {
        mese = new ArrayList<>();
        for(int i = 1; i < 11; i++){
            mese.add(new Masa(i, false));
        }
    }

    public static synchronized Restaurant getInstance() {
        if (instance == null) {
            instance = new Restaurant();
        }
        return instance;
    }

    public synchronized void ocupaMasa(int idMasa) {
        for (Masa masa: mese) {
            if(masa.getId() == idMasa) {
                if(!masa.isOcupata()) {
                    masa.setOcupata(true);
                    System.out.println("Masa " + idMasa + " a fost ocupata");
                } else{
                    System.out.println("Masa " + idMasa + " este deja ocupata sau id-ul introdus nu exista");
                }
            }
        }
    }

    public synchronized void elibereazaMasa(int idMasa) {
        for (Masa masa: mese) {
            if(masa.getId() == idMasa) {
                if(masa.isOcupata()) {
                    masa.setOcupata(false);
                    System.out.println("Masa " + idMasa + " a fost eliberata");
                    break;
                } else{
                    System.out.println("Masa " + idMasa + " este deja libera sau id-ul introdus nu exista");
                }
            }
        }
    }

    public synchronized void afiseazaMese() {
        for (Masa masa: mese) {
            System.out.println("Masa " + masa.getId() + " este " + (masa.isOcupata() ? "ocupata" : "libera"));
        }
    }


}
