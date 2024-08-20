package com.rest.api.config;

import com.rest.api.data.repositories.CoursRepository;
import org.example.commons.data.entities.CoursEntity;
import org.example.commons.data.repositories.AnneeScolaireRepository;
import org.example.commons.data.repositories.ModulesRepository;
import org.example.commons.data.repositories.SemestresRepository;
import org.example.commons.services.CoursService;
import org.example.commons.services.impl.CoursServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EntityConfig {

    @Bean
    public CoursEntity coursEntity(){
        return new CoursEntity();
    }


}
