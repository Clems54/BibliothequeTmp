package com.miage.bibliotheque.utilities.dto;

import com.miage.bibliotheque.entity.Usager;

import java.util.UUID;

public class UsagerDTO extends IdentifiableDTO {
    private String nom;
    private String prenom;
    private String adresse;

    public String getNom() {
        return nom;
    }

    public UsagerDTO setNom(final String nom) {
        this.nom = nom;
        return this;
    }

    public String getPrenom() {
        return prenom;
    }

    public UsagerDTO setPrenom(final String prenom) {
        this.prenom = prenom;
        return this;
    }

    public String getAdresse() {
        return adresse;
    }

    public UsagerDTO setAdresse(final String adresse) {
        this.adresse = adresse;
        return this;
    }

    public Usager toObj() {
        final Usager obj = new Usager().setNom(nom).setPrenom(prenom).setAdresse(adresse);
        obj.setId(UUID.fromString(getId()));
        return obj;
    }

    public static UsagerDTO fromObj(final Usager obj) {
        final UsagerDTO dto = new UsagerDTO().setNom(obj.getNom()).setPrenom(obj.getPrenom()).setAdresse(obj.getAdresse());
        dto.setId(obj.getId().toString());
        return dto;
    }
}
