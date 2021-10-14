package com.miage.bibliotheque.control;

import com.miage.bibliotheque.entity.Usager;

import java.util.List;

public interface GestionUsager extends GestionDefautCRUD<Usager> {
    List<Usager> search(String name);
}
