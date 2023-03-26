package com.gestionformation;
import java.util.ArrayList;

public class Stagiaire extends Utilisateur {
    private int id_stag;
    private ArrayList<Session> sessionsInscrites;

    public Stagiaire(String nom, String prenom, String email, String motDePasse) {
        super(nom, prenom, email, motDePasse);
        this.sessionsInscrites = new ArrayList<Session>();
    }

    public void consulterCatalogueFormations() {
        
    }

    public void sInscrireFormation() {
    
    }

    public void ajouterCommentaire(Commentaire commentaire1) {
        
    }

    public void evaluerFormateur(Evaluation evaluation1) {
       
    }

    public void evaluerCentre() {
        
    }

    public void afficherSessionsInscrites() {
        System.out.println("Sessions inscrites :");
        for (Session session : sessionsInscrites) {
            System.out.println(session.getFormation().getTitre() + " - " + session.getDateDebut());
        }
    }

    public void inscrireSession(Session session) {
        sessionsInscrites.add(session);
    }

    public void desinscrireSession(Session session) {
        sessionsInscrites.remove(session);
    }

	public int getId_stag() {
		return id_stag;
	}

	public void setId_stag(int id_stag) {
		this.id_stag = id_stag;
	}

}
