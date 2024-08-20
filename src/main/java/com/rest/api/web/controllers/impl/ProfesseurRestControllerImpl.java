package com.rest.api.web.controllers.impl;

import com.rest.api.data.repositories.ProfesseurRepository;
import com.rest.api.web.controllers.ProfesseurRestController;
import com.rest.api.web.dto.request.ProfesseurDtoRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ProfesseurRestControllerImpl implements ProfesseurRestController {
    private final ProfesseurRepository professeurRepository;
    @Override
    public ResponseEntity<Map<Object, Object>> saveAnneeScolaire(ProfesseurDtoRequest professeurDtoRequest, BindingResult bindingResult) {
        return null;
    }
}
