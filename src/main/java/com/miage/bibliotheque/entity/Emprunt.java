package com.miage.bibliotheque.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Emprunt extends Identifiable {

    @Column(name = "date_retour")
    private LocalDateTime dateRetour;

    @Column(name = "date_emprunt")
    private LocalDateTime dateEmprunt;

    @ManyToOne
    private Exemplaire exemplaire;

    @ManyToOne
    private Usager usager;

    public LocalDateTime getDateRetour() {
        return dateRetour;
    }

    public Emprunt setDateRetour(final LocalDateTime dateRetour) {
        this.dateRetour = dateRetour;
        return this;
    }

    public LocalDateTime getDateEmprunt() {
        return dateEmprunt;
    }

    public Emprunt setDateEmprunt(final LocalDateTime dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
        return this;
    }

    public Exemplaire getExemplaire() {
        return exemplaire;
    }

    public Emprunt setExemplaire(final Exemplaire exemplaire) {
        this.exemplaire = exemplaire;
        return this;
    }

    public Usager getUsager() {
        return usager;
    }

    public Emprunt setUsager(final Usager usager) {
        this.usager = usager;
        return this;
    }
}
