package com.gestionformation;
public class Test {
	private String nomTest;
    private Formation formation;
    private Session session;
    private Formateur formateur;
    private Stagiaire stagiaire;
    private double score;
    private String commentaire;

    public Test(String nom ,Formation formation, Session session, Formateur formateur, Stagiaire stagiaire, double score, String commentaire) {
        this.formation = formation;
        this.session = session;
        this.formateur = formateur;
        this.stagiaire = stagiaire;
        this.score = score;
        this.commentaire = commentaire;
    }

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Formateur getFormateur() {
        return formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    public Stagiaire getStagiaire() {
        return stagiaire;
    }

    public void setStagiaire(Stagiaire stagiaire) {
        this.stagiaire = stagiaire;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

	public String getNomTest() {
		return nomTest;
	}

	public void setNomTest(String nomTest) {
		this.nomTest = nomTest;
	}
    }

