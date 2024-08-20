package com.rest.api.services.impl;

import com.rest.api.data.repositories.AnneeScolaireRepository;
import com.rest.api.services.AnneeScolaireService;
import com.rest.api.web.dto.request.AnneeScolaireDtoRequest;
import lombok.RequiredArgsConstructor;
import org.example.commons.data.entities.AnneeScolaireEntity;
import org.example.commons.data.entities.ClasseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AnneeScolaireServiceImpl implements AnneeScolaireService {
    private final AnneeScolaireRepository anneeScolaireRepo;
    @Override
    public void store(AnneeScolaireDtoRequest dto) {

        AnneeScolaireEntity entity= dto.toEntity();
        entity.setLibelle(dto.getLibelle());
        entity.setId(dto.getId());
        anneeScolaireRepo.save(entity);

    }
}
