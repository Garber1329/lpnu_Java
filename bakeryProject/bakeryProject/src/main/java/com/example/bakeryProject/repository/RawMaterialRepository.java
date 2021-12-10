package com.example.bakeryProject.repository;

import com.example.bakeryProject.dto.RawMaterialDTO;
import com.example.bakeryProject.model.RawMaterial;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RawMaterialRepository extends CrudRepository<RawMaterial,Long> {
    RawMaterial findRawMaterialByNameRawMaterial(String nameMaterial);
    List<RawMaterial> getAllURawMaterials();
    RawMaterial findRawMaterialById(Long id);
}
