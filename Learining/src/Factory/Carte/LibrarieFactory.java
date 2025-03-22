package Factory.Carte;

public class LibrarieFactory {

    public ProdusCarte creeazaProdusCarte(CategorieCarte categorieCarte) throws Exception {
        switch (categorieCarte) {
            case ROMAN:
                return new Roman();
            case ENCICLOPEDIE:
                return new Enciclopedie();
            case REVISTA:
                return new Revista();
            default:
                throw new Exception("Nu exista categoria de carte selectata: " + categorieCarte);
        }
    }
}