package com.gestionformation;
import java.util.ArrayList;
public class Formation {
    private int id;
    private String titre;
    private String description;
    private String formateur;
    private int duree;
    private ArrayList<String> sessions;

    public Formation(int id, String titre, String description, String formateur, int duree) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.formateur = formateur;
        this.duree = duree;
        sessions = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFormateur() {
        return formateur;
    }

    public void setFormateur(String formateur) {
        this.formateur = formateur;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public void ajouterSession(String session) {
        sessions.add(session);
    }

    public void supprimerSession(String session) {
        sessions.remove(session);
    }

    public ArrayList<String> getSessions() {
        return sessions;
    }
/*public void afficherDetails() {
    System.out.println("Formation " + this.titre + " (id: " + this.id + ")");
    System.out.println("Description : " + this.description);
    System.out.println("Formateur : " + this.formateur);
    System.out.println("Durée : " + this.duree + " heures");
    System.out.println("Sessions : ");
    for (String session : sessions) {
        System.out.println("- " + session);
    }
}
*/

	public void setFormateur(Formateur formateur) {
		// TODO Auto-generated method stub
		
	}

}
