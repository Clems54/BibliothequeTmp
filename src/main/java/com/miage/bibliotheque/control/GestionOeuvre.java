package com.miage.bibliotheque.control;

import com.miage.bibliotheque.entity.Oeuvre;

import java.util.List;

public interface GestionOeuvre extends GestionDefautCRUD<Oeuvre> {
    List<Oeuvre> search(String name);
}
