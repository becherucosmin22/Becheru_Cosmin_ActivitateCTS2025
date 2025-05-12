package Composite.StructuraOrganizationala;

import java.util.List;

interface ComponentaOrganizare {
    String getNume();
    double getCostSalariu();
    void adaugaSubordonat(ComponentaOrganizare componenta);
    void stergeSubordonat(ComponentaOrganizare componenta);
    List<ComponentaOrganizare> getSubordonati();
}