package com.rest.api.web.controllers;

import com.rest.api.web.dto.request.AnneeScolaireDtoRequest;
import com.rest.api.web.dto.request.ModuleCreateDtoRequest;
import org.example.commons.data.enums.EEtatCours;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

public interface ModuleRestController {

    @PostMapping("/module")
    ResponseEntity<Map<Object,Object>>
    createModule(@Validated @RequestBody ModuleCreateDtoRequest dtoRequest,
                 BindingResult bindingResult);


}
