package com.miage.bibliotheque.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Reservation extends Identifiable {

    @ManyToOne
    private Exemplaire exemplaire;

    @ManyToOne
    private Usager usager;

    @Column(name = "date_annulation")
    private LocalDateTime dateAnnulation;

    @Column(name = "date_reservation")
    private LocalDateTime dateReservation;

    public Exemplaire getExemplaire() {
        return exemplaire;
    }

    public Reservation setExemplaire(final Exemplaire exemplaire) {
        this.exemplaire = exemplaire;
        return this;
    }

    public Usager getUsager() {
        return usager;
    }

    public Reservation setUsager(final Usager usager) {
        this.usager = usager;
        return this;
    }

    public LocalDateTime getDateAnnulation() {
        return dateAnnulation;
    }

    public Reservation setDateAnnulation(final LocalDateTime dateAnnulation) {
        this.dateAnnulation = dateAnnulation;
        return this;
    }

    public LocalDateTime getDateReservation() {
        return dateReservation;
    }

    public Reservation setDateReservation(final LocalDateTime dateReservation) {
        this.dateReservation = dateReservation;
        return this;
    }
}
