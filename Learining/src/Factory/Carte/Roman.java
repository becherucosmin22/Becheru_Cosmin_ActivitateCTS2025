package Factory.Carte;

public class Roman extends ProdusCarte {

    public Roman() {
        super("Numele Trandafirului", 512, 39.99f, "Umberto Eco");
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Carte (Roman): " + getTitlu());
        System.out.println("Autor: " + getAutor());
        System.out.println("Numar pagini: " + getNrPagini());
        System.out.println("Pret: " + getPret() + " lei");
        System.out.println("Descriere: Roman istoric, bestseller internațional.");
    }
}