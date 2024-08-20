package com.rest.api.web.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.commons.data.entities.AnneeScolaireEntity;
import org.example.commons.data.entities.ProfesseurEntity;
import org.example.commons.data.enums.EGrade;
import org.example.commons.data.enums.ESpecialite;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfesseurDtoRequest {
    private  Long id;

    private  String nom;
    private  String prenom;
    private  String specialite;
    private  String grade;
    public ProfesseurEntity toEntity(){
        ProfesseurEntity professeur= ProfesseurEntity.builder()
                .grade(EGrade.CHARGE_DE_COURS)

                .specialite(ESpecialite.INFORMATIQUE)
                .build();
        return  professeur;
    }

}
