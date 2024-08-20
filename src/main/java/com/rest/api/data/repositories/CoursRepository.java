package com.rest.api.data.repositories;

import org.example.commons.data.entities.CoursEntity;

import org.example.commons.data.enums.EEtatCours;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CoursRepository extends JpaRepository<CoursEntity,Long> {


    Page<CoursEntity> findByIsArchivedIsFalseAndIsDoneIsFalse(Pageable pageable);
//
    Page<CoursEntity> findByEtatCoursIsLike(EEtatCours etatCours, Pageable pageable);

    Optional<CoursEntity> findById(Long id);
}
