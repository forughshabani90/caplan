package com.caplan.site.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Paint extends Product {
    private String color;
    private String outdoor;
    private String customColor;
    private String shadeType;
    private String availableColor;
    private String usage;
}
