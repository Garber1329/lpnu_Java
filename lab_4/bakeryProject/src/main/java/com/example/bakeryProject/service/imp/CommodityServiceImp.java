package com.example.bakeryProject.service.imp;

import com.example.bakeryProject.dto.CommodityDTO;
import com.example.bakeryProject.dto.RawMaterialDTO;
import com.example.bakeryProject.dto.UserDTO;
import com.example.bakeryProject.mapper.CommodityToCommodityDTOMapper;
import com.example.bakeryProject.model.Commodity;
import com.example.bakeryProject.model.RawMaterial;
import com.example.bakeryProject.repository.CommodityRepository;
import com.example.bakeryProject.service.CommodityService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Log4j
@Service
public class CommodityServiceImp implements CommodityService {
    @Autowired
    private CommodityRepository commodityRepository;
    @Autowired
    private CommodityToCommodityDTOMapper commodityMapper;

    @Override
    public List<CommodityDTO> getAllCommodities() {
        return commodityRepository.getAllCommodities ().stream ()
                .map (c->commodityMapper.toDTO (c)).collect(Collectors.toList());
    }

    @Override
    public boolean deleteCommodityById(final Long commodityId) {
        if (commodityRepository.findById(commodityId).isPresent()) {
            commodityRepository.deleteById(commodityId);
            return true;
        }
        return false;
    }

    @Override
    public void addCommodity(final CommodityDTO commodityDTO) {
        final Commodity commodity = commodityMapper.toEntity (commodityDTO);
        commodityRepository.save (commodity);
    }

    @Override
    public CommodityDTO findCommodityById(final Long id) {
        return commodityMapper.toDTO (commodityRepository.findCommodityById (id));
    }
}
