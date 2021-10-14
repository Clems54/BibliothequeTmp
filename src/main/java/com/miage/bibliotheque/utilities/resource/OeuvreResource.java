package com.miage.bibliotheque.utilities.resource;

import com.miage.bibliotheque.entity.Oeuvre;

import java.util.List;

public interface OeuvreResource extends DefautResource<Oeuvre> {
    List<Oeuvre> findByNom(String nom);
}
