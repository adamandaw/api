package com.rest.api.services;

import org.example.commons.data.entities.SessionDeCoursEntity;
import org.springframework.data.domain.Page;

public interface SessionDeCoursService {
    Page<SessionDeCoursEntity> getSessionDeCoursById(Long id, int page, int size);
}
