package com.rest.api.web.controllers;

import org.example.commons.data.enums.EEtatCours;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

public interface CoursRestController {

    @GetMapping("/cours")
    ResponseEntity<Map<Object,Object>>
    readAllCourPlanifier( @RequestParam(defaultValue = "0") int page,
                          @RequestParam(defaultValue = "8") int size,
                          @RequestParam(required = false) EEtatCours etat);

    @GetMapping("/cours/{id}")
    ResponseEntity<Map<Object,Object>>
    findCoursById( @PathVariable(name = "id") Long id,
                   @RequestParam(defaultValue = "0") int page,
                   @RequestParam(defaultValue = "8") int size);
    @GetMapping("/cours/{id}/etudiants")
    ResponseEntity<Map<Object,Object>>
    readEtudiantByCourId( @RequestParam(defaultValue = "0") int page,
                          @RequestParam(defaultValue = "8") int size,
                          @PathVariable() Long id);
}
