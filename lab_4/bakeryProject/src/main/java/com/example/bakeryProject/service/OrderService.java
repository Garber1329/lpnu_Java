package com.example.bakeryProject.service;

import com.example.bakeryProject.dto.OrderDTO;

import java.util.List;

public interface OrderService {

    List<OrderDTO> getAllOrders();
    boolean deleteOrderById(Long oderId);
    boolean addOrder(OrderDTO orderDTO);

    OrderDTO updateOrder(OrderDTO orderDTO);

    OrderDTO findByTitle(String title);
    OrderDTO findOrderById(Long id);

}
