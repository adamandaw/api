package com.rest.api.web.controllers.impl;

import com.rest.api.services.ModuleService;
import com.rest.api.web.controllers.ModuleRestController;
import com.rest.api.web.dto.RestResponse;
import com.rest.api.web.dto.request.ModuleCreateDtoRequest;
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
@RequiredArgsConstructor
@RequestMapping("/api")
public class ModuleRestControllerImpl implements ModuleRestController {
    private final ModuleService moduleService;

    @Override
    public ResponseEntity<Map<Object, Object>> createModule(ModuleCreateDtoRequest dtoRequest, BindingResult bindingResult) {
        Map<Object, Object> response;
        if (bindingResult.hasErrors()){
            Map<String, String> errors =new HashMap<>();
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            fieldErrors.forEach(fieldError -> errors.put(fieldError.getField(),fieldError.getDefaultMessage()));
            response= RestResponse.toSingleResponse(errors, HttpStatus.NOT_FOUND);
        }else{
            moduleService.store(dtoRequest);
            response= RestResponse.toSingleResponse(dtoRequest,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    }

