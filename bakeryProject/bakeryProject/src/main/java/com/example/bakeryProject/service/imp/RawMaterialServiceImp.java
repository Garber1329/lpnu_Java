package com.example.bakeryProject.service.imp;

import com.example.bakeryProject.dto.RawMaterialDTO;
import com.example.bakeryProject.dto.UserDTO;
import com.example.bakeryProject.exeption.EmailExceptionNotFound;
import com.example.bakeryProject.mapper.RawMaterialToRawMaterialDTOMapper;
import com.example.bakeryProject.model.RawMaterial;
import com.example.bakeryProject.model.User;
import com.example.bakeryProject.repository.RawMaterialRepository;
import com.example.bakeryProject.service.RawMaterialService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Log4j
@Service
public class RawMaterialServiceImp implements RawMaterialService {
    @Autowired
    private RawMaterialRepository rawMaterialRepository;

    @Autowired
    private RawMaterialToRawMaterialDTOMapper rawMaterialDTOMapper;
    @Override
    public RawMaterialDTO findRawMaterialByName(final String nameMaterial) {
        log.info ("Method find Material");
        return rawMaterialDTOMapper.toDTO (rawMaterialRepository.
                findRawMaterialByNameRawMaterial (nameMaterial));
    }



    @Override
    public List<RawMaterialDTO> getAllRawMaterials() {
        return
                rawMaterialRepository.getAllURawMaterials ()
                        .stream().map (e->rawMaterialDTOMapper
                        .toDTO ((e)))
                        .collect(Collectors.toList());

    }

    @Override
    public boolean deleteRawMaterialById(final Long rawMaterialId) {
        if(rawMaterialRepository.findById (rawMaterialId).isPresent ()){
            rawMaterialRepository.deleteById (rawMaterialId);
            return true;
        }
        return false;
    }

    @Override
    public boolean addRawMaterials(final RawMaterialDTO rawMaterialDTO)  {

        final RawMaterial rawMaterial = rawMaterialDTOMapper.toModel (rawMaterialDTO);
        rawMaterialRepository.save (rawMaterial);
        return true;
    }


    @Override
    public RawMaterialDTO findRawMaterialById(final Long id) {
        return rawMaterialDTOMapper.toDTO (rawMaterialRepository.findRawMaterialById (id));
    }


}
