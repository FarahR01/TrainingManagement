package com.gestionformation;

	public class Evaluation {
	    private int note;
	    private String commentaire;

	    public Evaluation(int note, String avis) {
	        this.note = note;
	        this.commentaire = avis;
	    }

	    public int getNote() {
	        return note;
	    }

	    public void setNote(int note) {
	        this.note = note;
	    }

	    public String getAvis() {
	        return commentaire;
	    }

	    public void setAvis(String avis) {
	        this.commentaire = avis;
	    }
	}
