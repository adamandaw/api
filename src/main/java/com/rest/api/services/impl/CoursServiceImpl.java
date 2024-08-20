package com.rest.api.services.impl;

import com.rest.api.data.repositories.CoursRepository;
import com.rest.api.services.CoursService;
import org.example.commons.data.entities.CoursEntity;
import org.example.commons.data.enums.EEtatCours;
import org.example.commons.data.repositories.AnneeScolaireRepository;
import org.example.commons.data.repositories.ModulesRepository;
import org.example.commons.data.repositories.SemestresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursServiceImpl implements CoursService {
    @Autowired
    private  CoursRepository coursRepository ;


    @Override
    public Page<CoursEntity> getAllCoursPlanifier(int page, int size) {
        return coursRepository.findByIsArchivedIsFalseAndIsDoneIsFalse(PageRequest.of(page,size));
    }

    @Override
    public Page<CoursEntity> getListCoursByEtat(EEtatCours etat, int page, int size) {
        return coursRepository.findByEtatCoursIsLike(etat,PageRequest.of(page,size));
    }

    @Override
    public CoursEntity getCourById(Long id) {
        return coursRepository.findById(id).get();
    }
}
