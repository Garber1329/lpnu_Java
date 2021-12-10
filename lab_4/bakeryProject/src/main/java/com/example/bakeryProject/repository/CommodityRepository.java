package com.example.bakeryProject.repository;

import com.example.bakeryProject.model.Commodity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommodityRepository extends CrudRepository<Commodity,Long> {
    List<Commodity> getAllCommodities();
    Commodity findCommodityById(long id);
}


