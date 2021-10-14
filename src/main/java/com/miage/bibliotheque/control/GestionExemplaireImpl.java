package com.miage.bibliotheque.control;

import com.miage.bibliotheque.entity.Exemplaire;
import com.miage.bibliotheque.utilities.resource.ExemplaireResource;
import org.springframework.stereotype.Service;

@Service
public class GestionExemplaireImpl extends GestionDefautCRUDImpl<Exemplaire, ExemplaireResource> implements GestionExemplaire {
    public GestionExemplaireImpl(final ExemplaireResource resource) {
        super(resource);
    }
}
