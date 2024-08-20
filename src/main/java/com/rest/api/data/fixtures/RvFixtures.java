package com.rest.api.data.fixtures;

import com.rest.api.data.entities.RvRestEntity;
import com.rest.api.data.repositories.RVRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
@RequiredArgsConstructor
@Component
public class RvFixtures implements CommandLineRunner {
    private final RVRepository repository;
    @Override
    public void run(String... args) throws Exception {
        for (int i=0; i < 10; i++) {
            RvRestEntity annee = new RvRestEntity();
            annee.setDate("10/0"+i+"/2024");
            repository.save(annee);
        }
    }
}
