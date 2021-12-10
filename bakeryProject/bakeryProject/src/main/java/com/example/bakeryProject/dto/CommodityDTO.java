package com.example.bakeryProject.dto;

import com.example.bakeryProject.model.Order;
import com.example.bakeryProject.model.RawMaterial;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommodityDTO {


    private Long id;
    @NotNull
    private String price;
    @NotNull
    private String nameProduct;
    List<RawMaterialDTO> rawMaterials;

}
