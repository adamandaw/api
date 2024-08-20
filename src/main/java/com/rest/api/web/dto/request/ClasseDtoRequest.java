package com.rest.api.web.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.commons.data.entities.AnneeScolaireEntity;
import org.example.commons.data.entities.ClasseEntity;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClasseDtoRequest {
    private  Long id;

    private  String libelle;
    public ClasseEntity toEntity(){
        ClasseEntity anneeScolaire= ClasseEntity.builder()
                .libelle(libelle)

                .build();
        return  anneeScolaire;
    }
}
