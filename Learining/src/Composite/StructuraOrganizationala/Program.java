package Composite.StructuraOrganizationala;

public class Program {
    public static void main(String[] args) {
        Angajat angajat1 = new Angajat("Ion", 3000);
        Angajat angajat2 = new Angajat("Ana", 4000);
        Angajat angajat3 = new Angajat("Mihai", 3500);
        Angajat angajat4 = new Angajat("Elena", 4500);

        // Crează departamente
        Departament departamentIT = new Departament("IT");
        Departament departamentMarketing = new Departament("Marketing");
        Departament departamentGeneral = new Departament("General");

        departamentIT.adaugaSubordonat(angajat1);
        departamentIT.adaugaSubordonat(angajat2);

        departamentMarketing.adaugaSubordonat(angajat3);

        departamentGeneral.adaugaSubordonat(departamentIT);
        departamentGeneral.adaugaSubordonat(departamentMarketing);
        departamentGeneral.adaugaSubordonat(angajat4);

        System.out.println("Cost total salarii " + angajat1.getNume() + ": " + angajat1.getCostSalariu());
        System.out.println("Cost total salarii " + departamentIT.getNume() + ": " + departamentIT.getCostSalariu());
        System.out.println("Cost total salarii " + departamentMarketing.getNume() + ": " + departamentMarketing.getCostSalariu());
        System.out.println("Cost total salarii " + departamentGeneral.getNume() + ": " + departamentGeneral.getCostSalariu());

        System.out.println("\nSubordonații departamentului " + departamentGeneral.getNume() + ":");
        afiseazaSubordonati(departamentGeneral, 0);
    }

    public static void afiseazaSubordonati(ComponentaOrganizare componenta, int nivel) {
        StringBuilder indentare = new StringBuilder();
        for (int i = 0; i < nivel; i++) {
            indentare.append("  ");
        }
        System.out.println(indentare.toString() + componenta.getNume() + " (Cost: " + componenta.getCostSalariu() + ")");

        for (ComponentaOrganizare subordonat : componenta.getSubordonati()) {
            afiseazaSubordonati(subordonat, nivel + 1);
        }
    }
}