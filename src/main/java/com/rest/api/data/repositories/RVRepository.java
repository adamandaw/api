package com.rest.api.data.repositories;

import com.rest.api.data.entities.RvRestEntity;
import org.example.commons.data.entities.AnneeScolaireEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RVRepository extends JpaRepository<RvRestEntity,Long> {
}
