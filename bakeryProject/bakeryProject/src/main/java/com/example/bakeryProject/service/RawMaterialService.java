package com.example.bakeryProject.service;

import com.example.bakeryProject.dto.RawMaterialDTO;
import com.example.bakeryProject.dto.UserDTO;

import java.util.List;

public interface RawMaterialService {

    RawMaterialDTO findRawMaterialByName(String nameMaterial);

    List<RawMaterialDTO> getAllRawMaterials();

    boolean deleteRawMaterialById(Long rawMaterialId);

    boolean addRawMaterials(RawMaterialDTO rawMaterialDTO);

    RawMaterialDTO findRawMaterialById(Long id);
}
