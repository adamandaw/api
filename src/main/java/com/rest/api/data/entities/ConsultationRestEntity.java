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
@Table(name = "consultation")
@Builder
public class ConsultationRestEntity extends RvRestEntity{
    @Column
    private String medecin;
}
