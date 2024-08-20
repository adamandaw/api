package com.rest.api.services;

import org.example.commons.data.entities.CoursEntity;
import org.example.commons.data.enums.EEtatCours;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CoursService {

    Page<CoursEntity> getAllCoursPlanifier(int page, int size);
    Page<CoursEntity> getListCoursByEtat(EEtatCours etat, int page, int size);

    CoursEntity getCourById(Long id);
}
