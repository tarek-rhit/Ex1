package com.dai4.model;

public class Apprenant extends Personne{

    private int id;

    public Apprenant(String nom, String prenom, int id) {
        super(nom, prenom);
        this.id = id;
    }

    public void afficher(){
        System.out.println("l'apprenat à un identifiant :"+this.id);
        super.afficher();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Apprenant{" +
                "id='" + id + '\'' +
                '}';
    }
}
