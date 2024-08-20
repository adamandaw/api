package com.rest.api.web.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.commons.data.entities.CoursEntity;
import org.example.commons.data.entities.EtudiantEntity;
import org.example.commons.data.entities.SessionDeCoursEntity;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EtudiantDtoResponse {
    private Long id;
    private String nomComplet;



    public static EtudiantDtoResponse toDto(EtudiantEntity etudiant){

        return  EtudiantDtoResponse.builder()
                .id(etudiant.getId())
                .nomComplet(etudiant.getPrenom() + " "+ etudiant.getNom())
                .build();
    }
}
