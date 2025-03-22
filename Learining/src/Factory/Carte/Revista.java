package Factory.Carte;


public class Revista extends ProdusCarte {

    public Revista() {
        super("National Geographic", 80, 19.99f, "National Geographic Society");
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Carte (Revistă): " + getTitlu());
        System.out.println("Editura/Autor: " + getAutor());
        System.out.println("Numar pagini: " + getNrPagini());
        System.out.println("Pret: " + getPret() + " lei");
        System.out.println("Descriere: Publicație periodică dedicată științei, naturii și culturii globale.");
    }
}