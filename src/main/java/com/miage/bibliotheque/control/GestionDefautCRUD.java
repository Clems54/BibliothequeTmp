package com.miage.bibliotheque.control;

import java.util.List;

public interface GestionDefautCRUD<T> {
    List<T> getAll();

    void create(T obj);

    void update(String id, T obj);

    void delete(String id);
}