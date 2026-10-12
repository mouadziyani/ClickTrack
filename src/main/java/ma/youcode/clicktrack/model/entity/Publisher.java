package ma.youcode.clicktrack.model.entity;

import ma.youcode.clicktrack.model.enums.Categorie;

public class Publisher {
    private int id;
    private String nom;
    private String prenom;
    private Categorie categorie;

    public Publisher(){

    }

    public Publisher(int id, String nom, String prenom, Categorie categorie) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.categorie = categorie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
}