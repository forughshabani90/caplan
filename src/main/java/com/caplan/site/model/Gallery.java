package com.caplan.site.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Gallery {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Gallery")
    @SequenceGenerator(name = "Gallery",sequenceName = "Gallery",allocationSize = 1)
    private Long id;
    private String description;

}
