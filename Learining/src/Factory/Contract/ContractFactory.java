package Factory.Contract;

public class ContractFactory {
    public Contract creeazaContract(CategorieContract categorieContract, int nrPagini, String descriere) throws Exception {
        switch (categorieContract) {
            case VANZARE:
                return new Vanzare(nrPagini, descriere);
            case INCHIRIERE:
                return new Inchiriere(nrPagini, descriere);
            default:
                throw new Exception("Nu exista categoria de carte selectata: " + categorieContract);
        }
    }
}
