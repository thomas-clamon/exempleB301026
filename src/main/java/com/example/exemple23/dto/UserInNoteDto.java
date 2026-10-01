package com.example.exemple23.dto;

import java.util.List;

/*
Cette structure sert a envoyer un Etudiant avec sa liste de notr
 */
public class UserInNoteDto {

    private String prenom;
    private String nom;
    private List<Float> notes;

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Float> getNotes() {
        return notes;
    }

    public void setNotes(List<Float> notes) {
        this.notes = notes;
    }
}
