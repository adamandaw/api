package com.rest.api.data.repositories;

import org.example.commons.data.entities.AnneeScolaireEntity;
import org.example.commons.data.entities.ModuleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleRepository extends JpaRepository<ModuleEntity,Long> {
}
