package com.rest.api.web.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.commons.data.entities.CoursEntity;
import org.example.commons.data.entities.ParticipationCoursEntity;
import org.example.commons.data.entities.SalleEntity;
import org.example.commons.data.entities.SessionDeCoursEntity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoursSessionDtoResponse {
    private Long id;
    private LocalDate date;
    private LocalTime heureDebut;
    private LocalTime finHeure;
    private String typeSession;
    private String professeurNomComplet;
    private String libelleModule;
    private String libelleSalle;
    public static CoursSessionDtoResponse toDto(SessionDeCoursEntity sessionDeCours){

        return  CoursSessionDtoResponse.builder()
                .id(sessionDeCours.getId())
                .date(sessionDeCours.getDate())
                .libelleSalle(sessionDeCours.getTypeSession().compareTo("En Présentiel") ==0?
                        sessionDeCours.getSalle().getLibelle().toString() : null)
                .typeSession(String.valueOf(sessionDeCours.getTypeSession()))
                //.libelleSalle(sessionDeCours.getSalle().getLibelle())
                .heureDebut(sessionDeCours.getDebutHeure())
                .finHeure(sessionDeCours.getFinHeure())
                .professeurNomComplet(( "Mr " +sessionDeCours.getCour().getProfesseur().getNom()))
                .libelleModule(sessionDeCours.getCour().getModule().getLibelle())
                .build();
    }
}
