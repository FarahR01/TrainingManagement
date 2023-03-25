package com.gestionformation;

public class Document {
    private String typeDoc;
    private String nomDoc;
    private String createur;
    private Formation formation;

    public Document(String typeDoc, String nomDoc, String createur, Formation formation) {
        this.typeDoc = typeDoc;
        this.nomDoc = nomDoc;
        this.createur = createur;
        this.formation = formation;
    }

    public String getTypeDoc() {
        return typeDoc;
    }

    public void setTypeDoc(String typeDoc) {
        this.typeDoc = typeDoc;
    }

    public String getNomDoc() {
        return nomDoc;
    }

    public void setNomDoc(String nomDoc) {
        this.nomDoc = nomDoc;
    }

    public String getCreateur() {
        return createur;
    }

    public void setCreateur(String createur) {
        this.createur = createur;
    }

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public void afficherDetails() {
    	return ;
	}
}