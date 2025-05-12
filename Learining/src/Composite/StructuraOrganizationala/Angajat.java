package Composite.StructuraOrganizationala;

import java.util.ArrayList;
import java.util.List;

class Angajat implements ComponentaOrganizare {
    private String nume;
    private double salariu;

    public Angajat(String nume, double salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public double getCostSalariu() {
        return salariu;
    }

    @Override
    public void adaugaSubordonat(ComponentaOrganizare componenta) {
        throw new UnsupportedOperationException("Un angajat nu poate avea subordonati.");
    }

    @Override
    public void stergeSubordonat(ComponentaOrganizare componenta) {
        throw new UnsupportedOperationException("Un angajat nu poate avea subordonati.");
    }

    @Override
    public List<ComponentaOrganizare> getSubordonati() {
        return new ArrayList<>();
    }
}