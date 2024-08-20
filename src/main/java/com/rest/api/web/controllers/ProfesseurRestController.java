package com.rest.api.web.controllers;

import com.rest.api.web.dto.request.AnneeScolaireDtoRequest;
import com.rest.api.web.dto.request.ProfesseurDtoRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

public interface ProfesseurRestController {
    @PostMapping("/prof")
    ResponseEntity<Map<Object, Object>> saveAnneeScolaire(@Validated @RequestBody ProfesseurDtoRequest professeurDtoRequest,
                                                          BindingResult bindingResult);

}
