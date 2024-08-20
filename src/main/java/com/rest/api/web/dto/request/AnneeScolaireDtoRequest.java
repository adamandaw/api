package com.rest.api.web.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.commons.data.entities.AnneeScolaireEntity;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnneeScolaireDtoRequest {
    private  Long id;

    private  String libelle;
    public AnneeScolaireEntity toEntity(){
        AnneeScolaireEntity anneeScolaire= AnneeScolaireEntity.builder()
                .libelle(libelle)

                .build();
        return  anneeScolaire;
    }
}
