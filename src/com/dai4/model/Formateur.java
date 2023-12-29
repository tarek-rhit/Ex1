package com.dai4.model;

public class Formateur extends Personne{

    private String siren;


    public Formateur(String nom, String prenom, String siren) {
        super(nom, prenom);
        this.siren = siren;
    }

    public void afficher(){
        System.out.println("le numero du formateur est : "+this.siren);
       super.afficher();
    }

    public String getSiren() {
        return siren;
    }

    public void setSiren(String siren) {
        this.siren = siren;
    }

    @Override
    public String toString() {
        return "Formateur{" +
                "siren='" + siren + '\'' +
                '}';
    }
}
