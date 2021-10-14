package com.miage.bibliotheque.utilities.dto;

import com.miage.bibliotheque.entity.Exemplaire;

import java.util.UUID;

public class ExemplaireDTO extends IdentifiableDTO {
    private String etat;
    private OeuvreDTO oeuvre;

    public String getEtat() {
        return etat;
    }

    public ExemplaireDTO setEtat(final String etat) {
        this.etat = etat;
        return this;
    }

    public OeuvreDTO getOeuvre() {
        return oeuvre;
    }

    public ExemplaireDTO setOeuvre(final OeuvreDTO oeuvre) {
        this.oeuvre = oeuvre;
        return this;
    }

    public Exemplaire toObj() {
        final Exemplaire obj = new Exemplaire().setEtat(etat).setOeuvre(oeuvre.toObj());
        obj.setId(UUID.fromString(getId()));
        return obj;
    }

    public static ExemplaireDTO fromObj(final Exemplaire obj) {
        final ExemplaireDTO dto = new ExemplaireDTO().setEtat(obj.getEtat()).setOeuvre(OeuvreDTO.fromObj(obj.getOeuvre()));
        dto.setId(obj.getId().toString());
        return dto;
    }
}
