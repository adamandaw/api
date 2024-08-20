package com.rest.api.data.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "patients")
@Builder
public class PatientRestEntity  extends AbstractEntity{
    @Column
    private String numPatient;

    @Column
    private String nomComplet;
}
