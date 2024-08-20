package com.rest.api.web.controllers.impl;

import com.rest.api.services.CoursService;
import com.rest.api.services.SessionDeCoursService;
import com.rest.api.web.controllers.SessionDeCoursRestController;
import com.rest.api.web.dto.RestResponse;
import com.rest.api.web.dto.responses.CoursSessionDtoResponse;
import org.example.commons.data.entities.ClasseEntity;
import org.example.commons.data.entities.CoursEntity;
import org.example.commons.data.entities.EtudiantEntity;
import org.example.commons.data.entities.SessionDeCoursEntity;
import org.example.commons.services.SessionCoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
@RequestMapping("/api")
@RestController
public class SessionDeCoursRestControllerImpl implements SessionDeCoursRestController {
    @Autowired
    private SessionDeCoursService sessionDeCoursService;
    @Override
    public ResponseEntity<Map<Object, Object>> readSessionByCourId(int page, int size, Long id) {
        Map<Object,Object> response = new HashMap<>();
        Page<SessionDeCoursEntity> courById = sessionDeCoursService.getSessionDeCoursById(id, page, size);

        Page<CoursSessionDtoResponse> listSessionsCoursDto = courById.map(
                coursOfSessions -> {
                    return CoursSessionDtoResponse.toDto(coursOfSessions);
                }

        );

        response = RestResponse.paginateResponse(listSessionsCoursDto.getContent(),
                new  int[listSessionsCoursDto.getTotalPages()], page, listSessionsCoursDto.getTotalElements()
                , listSessionsCoursDto.getTotalPages(),  HttpStatus.OK);
        return new ResponseEntity<>(response, HttpStatus.OK );
      //  return null;
    }
}
