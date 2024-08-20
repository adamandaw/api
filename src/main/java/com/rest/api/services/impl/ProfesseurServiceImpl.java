package com.rest.api.services.impl;

import com.rest.api.data.repositories.ProfesseurRepository;
import com.rest.api.services.ProfesseurService;
import com.rest.api.web.dto.request.ProfesseurDtoRequest;
import lombok.RequiredArgsConstructor;
import org.example.commons.data.entities.AnneeScolaireEntity;
import org.example.commons.data.entities.ProfesseurEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfesseurServiceImpl implements ProfesseurService {
    private final ProfesseurRepository professeurRepository;
    @Override
    public void store(ProfesseurDtoRequest dto) {
        ProfesseurEntity entity= dto.toEntity();
        entity.setNom(dto.getNom());
        entity.setId(dto.getId());

        professeurRepository.save(entity);
    }
}
