package com.caplan.site.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "product_sec")
    @SequenceGenerator(name = "product_sec",sequenceName ="product_sec",allocationSize = 1)
    private Long id;
    private String name;
    private String price;
    private int code;
    private double weight;
    private String catalog;
}
