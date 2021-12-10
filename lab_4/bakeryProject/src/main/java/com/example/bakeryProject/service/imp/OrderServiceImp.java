package com.example.bakeryProject.service.imp;

import com.example.bakeryProject.dto.OrderDTO;
import com.example.bakeryProject.mapper.OrderToOrderDTOMapper;
import com.example.bakeryProject.model.Order;
import com.example.bakeryProject.repository.OrderRepository;
import com.example.bakeryProject.service.OrderService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
@Log4j
@Service
public class OrderServiceImp implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderToOrderDTOMapper orderDTOMapper;

    @Override
    public List<OrderDTO> getAllOrders() {
        log.info ("Method find all orders");
        orderRepository.getAllOrders ().stream ().map (o->orderDTOMapper.toDTO ((o))).collect(Collectors.toList());
        return null;
    }

    @Override
    public boolean deleteOrderById(final Long oderId) {
        if(orderRepository.findById (oderId).isPresent ()){
            orderRepository.deleteAllById (Collections.singleton (oderId));
            return true;
        }
        return false;
    }

    @Override
    public boolean addOrder(final OrderDTO orderDTO) {

        final Order order = orderDTOMapper.toEntity (orderDTO);
        orderRepository.save (order);

        return false;
    }
    @Override
    public OrderDTO updateOrder(final OrderDTO orderDTO) {
        log.info ("Method update Order");

        final  Order order = orderDTOMapper.toEntity (orderDTO);
        return  orderDTOMapper.toDTO (orderRepository.save (order));

    }
    @Override
    public OrderDTO findByTitle(final String title) {
        return orderDTOMapper.toDTO (orderRepository.findOrderByTitle (title));
    }

    @Override
    public OrderDTO findOrderById(final Long id) {
       return orderDTOMapper.toDTO (orderRepository.findOrderById (id));

    }
}
