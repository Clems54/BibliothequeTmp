package com.miage.bibliotheque.control;

import com.miage.bibliotheque.entity.Oeuvre;
import com.miage.bibliotheque.utilities.resource.OeuvreResource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GestionOeuvreImpl extends GestionDefautCRUDImpl<Oeuvre, OeuvreResource> implements GestionOeuvre {
    public GestionOeuvreImpl(final OeuvreResource resource) {
        super(resource);
    }

    @Override
    public List<Oeuvre> search(final String name) {
        return resource.findByNom(name);
    }
}
