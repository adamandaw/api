package com.rest.api.services;

import com.rest.api.web.dto.request.AnneeScolaireDtoRequest;
import org.example.commons.data.entities.CoursEntity;
import org.example.commons.data.enums.EEtatCours;
import org.springframework.data.domain.Page;

public interface AnneeScolaireService {


    void store(AnneeScolaireDtoRequest dto);
}
