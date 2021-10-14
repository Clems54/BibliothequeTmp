package com.miage.bibliotheque.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Oeuvre extends Identifiable {

    @Column(name = "nom")
    private String nom;

    @OneToMany
    private List<Exemplaire> exemplaires;

    public String getNom() {
        return nom;
    }

    public Oeuvre setNom(final String nom) {
        this.nom = nom;
        return this;
    }

    public List<Exemplaire> getExemplaires() {
        return exemplaires;
    }

    public Oeuvre setExemplaires(final List<Exemplaire> extemplaires) {
        this.exemplaires = extemplaires;
        return this;
    }
}
