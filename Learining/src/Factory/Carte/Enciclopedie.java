package Factory.Carte;


public class Enciclopedie extends ProdusCarte {

    public Enciclopedie() {
        super("Enciclopedia Universala", 1024, 89.99f, "Colectiv Autori");
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Carte (Enciclopedie): " + getTitlu());
        System.out.println("Autor(i): " + getAutor());
        System.out.println("Numar pagini: " + getNrPagini());
        System.out.println("Pret: " + getPret() + " lei");
        System.out.println("Descriere: Lucrare de referință ce conține informații ample și detaliate din diverse domenii.");
    }
}