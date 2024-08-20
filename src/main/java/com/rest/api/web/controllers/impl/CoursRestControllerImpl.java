package com.rest.api.web.controllers.impl;

import com.rest.api.services.CoursService;
import com.rest.api.web.controllers.CoursRestController;
import com.rest.api.web.dto.RestResponse;
import com.rest.api.web.dto.responses.CoursDtoResponse;
import com.rest.api.web.dto.responses.CoursSessionDtoResponse;
import com.rest.api.web.dto.responses.EtudiantDtoResponse;
import org.example.commons.data.entities.*;

import org.example.commons.data.enums.EEtatCours;
import org.example.commons.data.repositories.*;
import org.example.commons.services.impl.SessionCoursServiceImpl;
import org.example.commons.web.controllers.CoursController;
import org.example.commons.web.controllers.SessionCoursController;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RequestMapping("/api")
@RestController
public class CoursRestControllerImpl implements CoursRestController {

    @Autowired
    private CoursService coursService;


    @Override
    public ResponseEntity<Map<Object,Object>> readAllCourPlanifier(int page, int size,EEtatCours etat) {
        Map<Object,Object> response = new HashMap<>();

        Page<CoursEntity> courses = coursService.getAllCoursPlanifier(page,size);
        Page<CoursEntity> listCoursByEtat = coursService.getListCoursByEtat(etat, page, size);
        Page<com.rest.api.web.dto.responses.CoursDtoResponse> dtoCoursByEtat = listCoursByEtat.map(
                coursEntityByEtat -> com.rest.api.web.dto.responses.CoursDtoResponse.toDto(coursEntityByEtat)
        );
        Page<com.rest.api.web.dto.responses.CoursDtoResponse> listCoursDto = courses.map(
                cour -> CoursDtoResponse.toDto(cour)
        );

        if (etat == null ){

            response = RestResponse.paginateResponse(listCoursDto.getContent(),
                    new int[listCoursDto.getTotalPages()], page, listCoursDto.getTotalElements()
                    , listCoursDto.getTotalPages(),  HttpStatus.OK);
        }else {
            response = RestResponse.paginateResponse(dtoCoursByEtat.getContent(),
                    new  int[dtoCoursByEtat.getTotalPages()], page, dtoCoursByEtat.getTotalElements()
                    , dtoCoursByEtat.getTotalPages(),  HttpStatus.OK);
        }

        return new ResponseEntity<>(response, HttpStatus.OK );
    }

    @Override
    public ResponseEntity<Map<Object, Object>> findCoursById(Long id,@RequestParam(defaultValue = "0") int page,
                                                             @RequestParam(defaultValue = "8") int size) {
        Map<Object,Object> response = new HashMap<>();
       CoursEntity courById = coursService.getCourById(id);
        if (courById == null) {
            return  new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
       response = RestResponse.toSingleResponse(courById,
               HttpStatus.OK);
        return  new ResponseEntity<>(response, HttpStatus.OK );
    }

    @Override
    public ResponseEntity<Map<Object, Object>> readEtudiantByCourId(int page, int size, Long id) {
        CoursEntity courById = coursService.getCourById(id);
        if (courById == null) {
            return  new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
//        Page<com.rest.api.web.dto.responses.CoursDtoResponse> listCoursDto = courById.getSessionsCours().map(
//                cour -> CoursDtoResponse.toDto(cour)
//        );
//
        return null;
    }


    //        CoursEntity coursEntity = courById.getContent().get(0); // Récupérer le premier cours
//        List<EtudiantDtoResponse> etudiantDtoList = new ArrayList<>();
//
   // List<ClasseEntity> classes = courById.getClasses();
//        for (ClasseEntity classeEntity : coursEntity.getClasses()) {
//            for (InscriptionEntity inscriptionEntity : classeEntity.getInscriptions()) {
//                    EtudiantDtoResponse etudiantDto = EtudiantDtoResponse.toDto(inscriptionEntity.getEtudiant());
//                    etudiantDtoList.add(etudiantDto);
//            }
//        }

//    @Override
//    public ResponseEntity<Map<Object, Object>>
//    readSessionByCourId(int page, int size, Long id) {
//
//        return null;
//    }

}
