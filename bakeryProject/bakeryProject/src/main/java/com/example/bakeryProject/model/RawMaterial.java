package com.example.bakeryProject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "raw_material")
public class RawMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name_raw_raterial")
    private String nameRawMaterial;

    @Column(name = "price")
    private Double price;

    @Column(name = "count_raw_material")
    private Integer countRaMaterial;

    @ManyToOne
    @JoinColumn(name="commodity_id",nullable = false)
    private Commodity commodity;
}
