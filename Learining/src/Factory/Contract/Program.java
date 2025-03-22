package Factory.Contract;

public class Program {
    public static void main(String[] args) throws Exception {
        ContractFactory factory = new ContractFactory();
        Contract vanzare = null;
        Contract inchiriere = null;

        vanzare = factory.creeazaContract(CategorieContract.VANZARE, 234, "Vanzarea unei masini catre o persoana fizica");
        inchiriere = factory.creeazaContract(CategorieContract.INCHIRIERE, 34, "Inchirierea unei garsoniere catre o persoana");
        vanzare.detalii();
        inchiriere.detalii();
    }
}
