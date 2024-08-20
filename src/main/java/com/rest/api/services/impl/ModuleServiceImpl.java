package com.rest.api.services.impl;

import com.rest.api.data.repositories.ModuleRepository;
import com.rest.api.services.CoreService;
import com.rest.api.services.ModuleService;
import com.rest.api.web.dto.request.ModuleCreateDtoRequest;
import lombok.RequiredArgsConstructor;
import org.example.commons.data.entities.ModuleEntity;
import org.example.commons.data.entities.SessionDeCoursEntity;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ModuleServiceImpl implements ModuleService  {
    private final ModuleRepository moduleRepository;
    @Override
    public void store(ModuleCreateDtoRequest dtoRequest) {
        ModuleEntity entity=dtoRequest.toEntity();
        entity.setLibelle(dtoRequest.getLibelle());
        moduleRepository.saveAndFlush(entity);
    }


}
