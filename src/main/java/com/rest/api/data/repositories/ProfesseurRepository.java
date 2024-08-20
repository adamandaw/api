package com.rest.api.data.repositories;

import org.example.commons.data.entities.AnneeScolaireEntity;
import org.example.commons.data.entities.ProfesseurEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesseurRepository  extends JpaRepository<ProfesseurEntity,Long> {
}
