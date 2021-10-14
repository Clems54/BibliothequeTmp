package com.miage.bibliotheque.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@MappedSuperclass
public class Identifiable {

    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    public UUID getId() {
        return id;
    }

    public Identifiable setId(final UUID id) {
        this.id = id;
        return this;
    }
}