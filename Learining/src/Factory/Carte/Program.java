package Factory.Carte;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Program {
    private static final Logger logger = Logger.getLogger(Program.class.getName());

    public static void main(String[] args) {
        // Instanțiem factory-ul
        LibrarieFactory librarieFactory = new LibrarieFactory();
        ProdusCarte roman = null;
        ProdusCarte enciclopedie = null;
        ProdusCarte revista = null;

        try {
            // Cerem fabricii să ne creeze un Roman
            roman = librarieFactory.creeazaProdusCarte(CategorieCarte.ROMAN);
            // Cerem fabricii să ne creeze o Enciclopedie
            enciclopedie = librarieFactory.creeazaProdusCarte(CategorieCarte.ENCICLOPEDIE);
            //Cerem fabricii sa ne creeze o revista
            revista = librarieFactory.creeazaProdusCarte(CategorieCarte.REVISTA);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Eroare la crearea produsului", e);
        }

        // Apelăm metoda de descriere a produsului (carții)
        if (roman != null) {
            roman.afiseazaDescriere();
        } else {
            logger.log(Level.WARNING, "Produsul Roman este null");
        }

        if (enciclopedie != null) {
            enciclopedie.afiseazaDescriere();
        } else {
            logger.log(Level.WARNING, "Produsul Enciclopedie este null");
        }

        if (revista != null) {
            revista.afiseazaDescriere();
        } else {
            logger.log(Level.WARNING, "Produsul Revista este null");
        }
    }
}