package com.example.bakeryProject.repository;

import com.example.bakeryProject.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order,Long> {
    List<Order> getAllOrders();
    Order findOrderByTitle(String title);
    Order findOrderById(Long id);
}
