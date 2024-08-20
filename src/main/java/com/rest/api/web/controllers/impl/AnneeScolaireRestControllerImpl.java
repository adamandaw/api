package com.rest.api.web.controllers.impl;

import com.rest.api.services.AnneeScolaireService;
import com.rest.api.web.controllers.AnneeScolaireRestController;
import com.rest.api.web.dto.RestResponse;
import com.rest.api.web.dto.request.AnneeScolaireDtoRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AnneeScolaireRestControllerImpl implements AnneeScolaireRestController {
    private final AnneeScolaireService anneeScolaireService;
    @Override
    public ResponseEntity<Map<Object, Object>> saveAnneeScolaire(AnneeScolaireDtoRequest anneeScolaireDtoRequest, BindingResult bindingResult) {
        Map<Object, Object> response;
        if (bindingResult.hasErrors()){
            Map<String, String> errors =new HashMap<>();
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            fieldErrors.forEach(fieldError -> errors.put(fieldError.getField(),fieldError.getDefaultMessage()));
            response= RestResponse.toSingleResponse(errors, HttpStatus.NOT_FOUND);
        }else{
            anneeScolaireService.store(anneeScolaireDtoRequest);
            response= RestResponse.toSingleResponse(anneeScolaireDtoRequest,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    }

