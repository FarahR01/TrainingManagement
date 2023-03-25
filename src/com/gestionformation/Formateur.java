package com.gestionformation;

import java.util.ArrayList;

public class Formateur extends Utilisateur {
    private ArrayList<Formation> formationsEnseignees;

    public Formateur(String nom, String prenom, String email, String motDePasse) {
        super(nom, prenom, email, motDePasse);
        this.formationsEnseignees = new ArrayList<Formation>();
    }

    public void setFormationsEnseignees(ArrayList<Formation> formationsEnseignees) {
		this.formationsEnseignees = formationsEnseignees;
	}

	public void gererFormation(Formation formation) {
        // Code pour gérer la formation
        System.out.println("La formation " + formation.getTitre() + " a été gérée.");
    }

    public void evaluerStagiaire(Stagiaire stagiaire, Evaluation evaluation) {
        // Code pour évaluer le stagiaire
        System.out.println("Le stagiaire " + stagiaire.getNom() + " a été évalué.");
    }

    public void gererCommentaire(Commentaire commentaire) {
        // Code pour gérer le commentaire
        System.out.println("Le commentaire de " + commentaire.getAuteur() + " a été géré.");
    }

    public void partagerDocument(Document document) {

        System.out.println("Le document " + document.getNomDoc() + " a été partagé.");
    }

    public void proposerTest(Test test) {

        System.out.println("Le test " + test.getNomTest() + " a été proposé.");
    }

    public ArrayList<Formation> getFormationsEnseignees() {
        return formationsEnseignees;
    }

    public void enseignerFormation(Formation formation) {
        formationsEnseignees.add(formation);
        formation.setFormateur(this);
    }
    
    public void afficherFormationsEnseignees() {
        System.out.println("Formations enseignées :");
        for (Formation formation : formationsEnseignees) {
            System.out.println(formation.getTitre());
        }
    }
}
