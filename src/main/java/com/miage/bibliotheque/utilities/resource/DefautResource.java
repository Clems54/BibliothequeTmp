package com.miage.bibliotheque.utilities.resource;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.UUID;

@NoRepositoryBean
public interface DefautResource<C> extends JpaRepository<C, UUID> {
}
