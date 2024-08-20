package com.rest.api.services;

import com.rest.api.web.dto.request.ModuleCreateDtoRequest;
import org.example.commons.data.entities.AnneeScolaireEntity;
import org.example.commons.data.entities.ModuleEntity;
import org.example.commons.data.entities.SessionDeCoursEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModuleService  {
    void store(ModuleCreateDtoRequest dtoRequest);
//    Page<SessionDeCoursEntity> getSessionDeCoursById(Long id, int page, int size);
}
