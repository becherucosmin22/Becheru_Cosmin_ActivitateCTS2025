package Facade.Comenzi;

class Notificare {
    public void trimiteEmail(String email, String mesaj) {
        System.out.println("Notificare: Trimite email la " + email + " cu mesajul: " + mesaj);
    }

    public void trimiteSMS(String telefon, String mesaj) {
        System.out.println("Notificare: Trimite SMS la " + telefon + " cu mesajul: " + mesaj);
    }
}