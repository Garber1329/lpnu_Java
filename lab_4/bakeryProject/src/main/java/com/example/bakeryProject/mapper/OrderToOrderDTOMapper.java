package com.example.bakeryProject.mapper;

import com.example.bakeryProject.dto.CommodityDTO;
import com.example.bakeryProject.dto.OrderDTO;
import com.example.bakeryProject.model.Commodity;
import com.example.bakeryProject.model.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class OrderToOrderDTOMapper {
    public Order toEntity(final OrderDTO orderDTO) {
        final Order order = new Order();

        order.setId(orderDTO.getId());
        order.setTitle (order.getTitle ());

        final List<Commodity> commodities = new ArrayList<>();
        order.setCommodities(commodities);

        return order;
    }

        public OrderDTO toDTO(final Order order) {
            final OrderDTO orderDTO = new OrderDTO();
        orderDTO.setTitle (order.getTitle ());
        orderDTO.setId(order.getId());

        final List<CommodityDTO> commodityDTOs = new ArrayList<>();
        orderDTO.setCommodities(commodityDTOs);


        return orderDTO;
    }
}
