package com.example.bakeryProject.mapper;

import com.example.bakeryProject.dto.RawMaterialDTO;
import com.example.bakeryProject.model.RawMaterial;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class RawMaterialToRawMaterialDTOMapper {

    public RawMaterial toModel(final RawMaterialDTO materialDTO){
        final RawMaterial rawMaterial = new RawMaterial();

        rawMaterial.setId(materialDTO.getId());
        rawMaterial.setNameRawMaterial (materialDTO.getNameRawMaterial ());
        rawMaterial.setPrice (materialDTO.getPrice ());
        rawMaterial.setCountRaMaterial (materialDTO.getCountRaMaterial ());
        return rawMaterial;
    }

    public RawMaterialDTO toDTO(final RawMaterial material){
        final RawMaterialDTO rawMaterialDTO = new RawMaterialDTO();

        rawMaterialDTO.setId(material.getId());
        rawMaterialDTO.setNameRawMaterial (material.getNameRawMaterial ());
        rawMaterialDTO.setPrice (material.getPrice ());
        rawMaterialDTO.setCountRaMaterial (rawMaterialDTO.getCountRaMaterial ());

        return rawMaterialDTO;
    }
}
