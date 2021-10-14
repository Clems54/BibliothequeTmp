package com.miage.bibliotheque.control;

import com.miage.bibliotheque.entity.Identifiable;
import com.miage.bibliotheque.utilities.resource.DefautResource;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;

public abstract class GestionDefautCRUDImpl<C extends Identifiable, R extends DefautResource<C>> implements GestionDefautCRUD<C> {
    protected final R resource;

    public GestionDefautCRUDImpl(final R resource) {
        this.resource = resource;
    }

    @Override
    public List<C> getAll() {
        return resource.findAll();
    }

    @Override
    public void create(final C obj) {
        if (resource.existsById(obj.getId())) {
            throw new ResponseStatusException(HttpStatus.CONFLICT);
        }
        resource.save(obj);
    }

    @Override
    public void update(final String id, final C obj) {
        obj.setId(UUID.fromString(id));
        if (!resource.existsById(obj.getId())) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        resource.save(obj);
    }

    @Override
    public void delete(final String id) {
        if (!resource.existsById(UUID.fromString(id))) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        resource.deleteById(UUID.fromString(id));
    }
}
