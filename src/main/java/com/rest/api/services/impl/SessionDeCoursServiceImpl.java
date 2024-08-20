package com.rest.api.services.impl;

import com.rest.api.data.repositories.SessionDeCoursRepository;
import com.rest.api.services.SessionDeCoursService;
import lombok.RequiredArgsConstructor;
import org.example.commons.data.entities.SessionDeCoursEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SessionDeCoursServiceImpl implements SessionDeCoursService {
    private final SessionDeCoursRepository sessionDeCoursRepository;
    @Override
    public Page<SessionDeCoursEntity> getSessionDeCoursById(Long id, int page, int size) {
        return sessionDeCoursRepository.findByCour_Id(id, PageRequest.of(page,size));
    }
}
