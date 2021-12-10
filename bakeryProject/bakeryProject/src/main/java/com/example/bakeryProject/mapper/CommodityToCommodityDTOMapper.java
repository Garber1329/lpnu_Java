package com.example.bakeryProject.mapper;

import com.example.bakeryProject.dto.RawMaterialDTO;
import com.example.bakeryProject.model.Commodity;
import com.example.bakeryProject.dto.CommodityDTO;
import com.example.bakeryProject.model.RawMaterial;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class CommodityToCommodityDTOMapper {
    public Commodity toEntity(final CommodityDTO commodityDTO){
        final Commodity commodity = new Commodity();

        commodity.setId(commodityDTO.getId());
        commodity.setPrice(commodityDTO.getPrice());
        commodity.setNameProduct (commodity.getNameProduct ());

        final List<RawMaterial> rawMaterialList = new ArrayList<> ();
        commodity.setRawMaterials (rawMaterialList);
        return commodity;
    }

    public CommodityDTO toDTO(final Commodity commodity){
        final CommodityDTO commodityDTO = new CommodityDTO();

        commodityDTO.setId(commodity.getId());
        commodityDTO.setPrice(commodity.getPrice());
        commodityDTO.setNameProduct (commodity.getNameProduct ());

        final List<RawMaterialDTO> rawMaterialDTOList = new ArrayList<> ();
        commodityDTO.setRawMaterials (rawMaterialDTOList);

        return commodityDTO;
    }

}
