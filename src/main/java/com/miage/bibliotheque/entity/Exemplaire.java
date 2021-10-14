package com.miage.bibliotheque.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Exemplaire extends Identifiable {

    @Column(name = "etat")
    private String etat;

    @ManyToOne
    private Oeuvre oeuvre;

    public String getEtat() {
        return etat;
    }

    public Exemplaire setEtat(final String etat) {
        this.etat = etat;
        return this;
    }

    public Oeuvre getOeuvre() {
        return oeuvre;
    }

    public Exemplaire setOeuvre(final Oeuvre oeuvre) {
        this.oeuvre = oeuvre;
        return this;
    }
}
