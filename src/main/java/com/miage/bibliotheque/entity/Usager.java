package com.miage.bibliotheque.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Usager extends Identifiable {

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "adresse")
    private String adresse;

    public String getNom() {
        return nom;
    }

    public Usager setNom(final String nom) {
        this.nom = nom;
        return this;
    }

    public String getPrenom() {
        return prenom;
    }

    public Usager setPrenom(final String prenom) {
        this.prenom = prenom;
        return this;
    }

    public String getAdresse() {
        return adresse;
    }

    public Usager setAdresse(final String adresse) {
        this.adresse = adresse;
        return this;
    }
}
