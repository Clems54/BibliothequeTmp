package com.miage.bibliotheque.utilities.dto;

import com.miage.bibliotheque.entity.Oeuvre;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class OeuvreDTO extends IdentifiableDTO {
    private String nom;
    private List<ExemplaireDTO> exemplaires;

    public String getNom() {
        return nom;
    }

    public OeuvreDTO setNom(final String nom) {
        this.nom = nom;
        return this;
    }

    public List<ExemplaireDTO> getExemplaires() {
        return exemplaires;
    }

    public OeuvreDTO setExemplaires(final List<ExemplaireDTO> exemplaires) {
        this.exemplaires = exemplaires;
        return this;
    }

    public Oeuvre toObj() {
        final Oeuvre obj = new Oeuvre().setNom(nom).setExemplaires(exemplaires.stream().map(ExemplaireDTO::toObj).collect(Collectors.toList()));
        obj.setId(UUID.fromString(getId()));
        return obj;
    }

    public static OeuvreDTO fromObj(final Oeuvre obj) {
        final OeuvreDTO dto = new OeuvreDTO().setNom(obj.getNom()).setExemplaires(obj.getExemplaires().stream().map(ExemplaireDTO::fromObj).collect(Collectors.toList()));
        dto.setId(obj.getId().toString());
        return dto;
    }
}
