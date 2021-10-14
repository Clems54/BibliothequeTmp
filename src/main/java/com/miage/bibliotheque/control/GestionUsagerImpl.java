package com.miage.bibliotheque.control;

import com.miage.bibliotheque.entity.Usager;
import com.miage.bibliotheque.utilities.resource.UsagerResource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GestionUsagerImpl extends GestionDefautCRUDImpl<Usager, UsagerResource> implements GestionUsager {
    public GestionUsagerImpl(final UsagerResource resource) {
        super(resource);
    }

    @Override
    public List<Usager> search(final String name) {
        return resource.findByNom(name);
    }
}
