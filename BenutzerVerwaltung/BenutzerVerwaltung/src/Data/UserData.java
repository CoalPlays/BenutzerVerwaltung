package Data;

import Model.Model;

public class UserData {
    private int ident = 0;
    private String ID;
    private String vorname;
    private String nachname;
    private String geburtsdatum;
    private String geschlecht;
    private String strasse;
    private String plz;
    private String ort;
    private String number;

    public UserData() {
    }

    public UserData(String ID, String vorname, String nachname, String geburtsdatum, String geschlecht, String strasse, String plz, String ort, String number) {
        this.ID = ID;
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
        this.geschlecht = geschlecht;
        this.strasse = strasse;
        this.plz = plz;
        this.ort = ort;
        this.number = number;

    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
