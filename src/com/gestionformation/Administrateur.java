package com.gestionformation;

import java.util.ArrayList;

public class Administrateur extends Utilisateur {
    private int id_admin;
    private ArrayList<Utilisateur> utilisateurs;

    public Administrateur(String nom, String prenom, String email, String motDePasse, int id_admin) {
        super(nom, prenom, email, motDePasse);
        utilisateurs = new ArrayList<>();
        this.id_admin = id_admin;
    }

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }

    public void ajouterUtilisateur(Utilisateur utilisateur) {
        utilisateurs.add(utilisateur);
    }

    public void supprimerUtilisateur(Utilisateur utilisateur) {
        utilisateurs.remove(utilisateur);
    }

    public void afficherUtilisateurs() {
        for (Utilisateur utilisateur : utilisateurs) {
            System.out.println(utilisateur);
        }
    }
}
