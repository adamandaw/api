package com.rest.api.web.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

public interface SessionDeCoursRestController {
    @GetMapping("/cours/{id}/sessions")
    ResponseEntity<Map<Object,Object>>
    readSessionByCourId( @RequestParam(defaultValue = "0") int page,
                         @RequestParam(defaultValue = "8") int size,
                         @PathVariable() Long id);
}
