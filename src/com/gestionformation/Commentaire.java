package com.gestionformation;

import java.util.Date;

public class Commentaire {
    private int id_commentaire;
    private String text;
    private Utilisateur auteur;
    private Date dateCreation;

    public int getId_commentaire() {
        return id_commentaire;
    }

    public String getText() {
        return text;
    }

    public Utilisateur getAuteur() {
        return auteur;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setId_commentaire(int id_commentaire) {
        this.id_commentaire = id_commentaire;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAuteur(Utilisateur auteur) {
        this.auteur = auteur;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
    
    
    
}
