package com.miage.bibliotheque.utilities.resource;

import com.miage.bibliotheque.entity.Usager;

import java.util.List;

public interface UsagerResource extends DefautResource<Usager> {
    List<Usager> findByNom(String nom);
}
