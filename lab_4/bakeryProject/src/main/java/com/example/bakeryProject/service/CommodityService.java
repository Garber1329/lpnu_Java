package com.example.bakeryProject.service;

import com.example.bakeryProject.dto.CommodityDTO;
import com.example.bakeryProject.dto.OrderDTO;

import java.util.List;

public interface CommodityService  {

    List<CommodityDTO> getAllCommodities();

    boolean deleteCommodityById(Long commodityId);

    void addCommodity(CommodityDTO commodityDTO);

    CommodityDTO findCommodityById(Long id);
}
