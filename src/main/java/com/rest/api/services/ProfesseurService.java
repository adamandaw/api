package com.rest.api.services;

import com.rest.api.web.dto.request.AnneeScolaireDtoRequest;
import com.rest.api.web.dto.request.ProfesseurDtoRequest;

public interface ProfesseurService {


    void store(ProfesseurDtoRequest dto);
}
