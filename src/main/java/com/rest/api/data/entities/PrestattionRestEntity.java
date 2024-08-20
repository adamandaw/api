package com.rest.api.data.entities;

import com.rest.api.data.enums.ETypePrestation;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "prestations")
@Builder
public class PrestattionRestEntity extends RvRestEntity{
    @Enumerated(value = EnumType.STRING)
    private ETypePrestation type;
}
