package Composite.StructuraOrganizationala;

import java.util.ArrayList;
import java.util.List;

class Departament implements ComponentaOrganizare {
    private String nume;
    private List<ComponentaOrganizare> subordonati;

    public Departament(String nume) {
        this.nume = nume;
        this.subordonati = new ArrayList<>();
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public double getCostSalariu() {
        double costTotal = 0;
        for (ComponentaOrganizare componenta : subordonati) {
            costTotal += componenta.getCostSalariu();
        }
        return costTotal;
    }

    @Override
    public void adaugaSubordonat(ComponentaOrganizare componenta) {
        subordonati.add(componenta);
    }

    @Override
    public void stergeSubordonat(ComponentaOrganizare componenta) {
        subordonati.remove(componenta);
    }

    @Override
    public List<ComponentaOrganizare> getSubordonati() {
        return subordonati;
    }
}