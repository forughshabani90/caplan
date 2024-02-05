package com.caplan.site.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Gallery {
    @Id
    private Long id;
    private String description;

}
