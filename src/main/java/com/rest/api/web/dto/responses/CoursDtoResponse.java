package com.rest.api.web.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.commons.data.entities.CoursEntity;
import org.example.commons.data.entities.SessionDeCoursEntity;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CoursDtoResponse {
    private Long id;
    private String libelle;
    private String semestre;
    private Integer heureGlobale;
    private Integer heurePlanifier;
    private Integer heureEffectuer;
    private String professeurNomComplet;
    private List<SessionDeCoursEntity>  sessionDeCours;


    public static CoursDtoResponse toDto(CoursEntity cours){

        return  CoursDtoResponse.builder()
                .id(cours.getId())
                .libelle(cours.getModule().getLibelle().toString())
                .semestre(cours.getSemestre().getLibelle().name())
                .heureGlobale(cours.getNbrHeureGlobal())
                .heurePlanifier(cours.getNbrHeurePlanifier())
                .heureEffectuer((cours.getNbrHeureEffectuer()))
                .professeurNomComplet(cours.getProfesseur().getNom())
                .sessionDeCours(cours.getSessionsCours())
                .build();
    }
}
