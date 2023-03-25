package com.gestionformation;
import java.util.ArrayList;
import java.util.Date;

public class Session {
    private Date dateDebut;
    private Date dateFin;
    private Formateur formateur;
    private Formation formation;
    private ArrayList<Stagiaire> stagiaires = new ArrayList<Stagiaire>();
    private ArrayList<Document> documents = new ArrayList<Document>();

    public Session(Date dateDebut, Date dateFin, Formateur formateur, Formation formation) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.formateur = formateur;
        this.formation = formation;
    }


	public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Formateur getFormateur() {
        return formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public ArrayList<Stagiaire> getStagiaires() {
        return stagiaires;
    }

    public void setStagiaires(ArrayList<Stagiaire> stagiaires) {
        this.stagiaires = stagiaires;
    }

    public void ajouterStagiaire(Stagiaire stagiaire) {
        this.stagiaires.add(stagiaire);
    }

    public void afficherStagiaires() {
        for (Stagiaire s : stagiaires) {
            System.out.println(s);
        }
    }

    public ArrayList<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(ArrayList<Document> documents) {
        this.documents = documents;
    }

    public void ajouterDocument(Document document) {
        this.documents.add(document);
    }

    public void afficherDocuments() {
        for (Document d : documents) {
            d.afficherDetails();
        }
    }
}
