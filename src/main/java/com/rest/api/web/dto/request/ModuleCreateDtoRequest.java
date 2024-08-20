package com.rest.api.web.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.commons.data.entities.ModuleEntity;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModuleCreateDtoRequest {
    private  Long id;

    private  String libelle;
    public ModuleEntity toEntity(){
        ModuleEntity module= ModuleEntity.builder()
                .libelle(libelle)

                .build();
        return  module;
    }
}
