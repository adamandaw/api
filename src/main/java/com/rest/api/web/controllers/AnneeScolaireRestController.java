package com.rest.api.web.controllers;

import com.rest.api.web.dto.request.AnneeScolaireDtoRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

public interface AnneeScolaireRestController {
    @PostMapping("/annee")
    ResponseEntity<Map<Object, Object>> saveAnneeScolaire(@Validated @RequestBody AnneeScolaireDtoRequest anneeScolaireDtoRequest, BindingResult bindingResult);

}
