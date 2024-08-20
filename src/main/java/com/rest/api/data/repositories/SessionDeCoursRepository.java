package com.rest.api.data.repositories;

import org.example.commons.data.entities.CoursEntity;
import org.example.commons.data.entities.SessionDeCoursEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionDeCoursRepository extends JpaRepository<SessionDeCoursEntity,Long> {
    Page<SessionDeCoursEntity> findByCour_Id(Long id, Pageable pageable );
}
