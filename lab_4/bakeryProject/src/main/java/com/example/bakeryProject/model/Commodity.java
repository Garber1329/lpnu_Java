package com.example.bakeryProject.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "commodity")
public class Commodity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name_product")
    private String nameProduct;

    @Column(name = "price")
    private String price;

    @ManyToOne
    @JoinColumn(name="order_id",nullable = false)
    private Order order;

    @OneToMany(mappedBy = "commodity", cascade = CascadeType.ALL,orphanRemoval = true)
    List<RawMaterial> rawMaterials = new ArrayList<> ();
}
