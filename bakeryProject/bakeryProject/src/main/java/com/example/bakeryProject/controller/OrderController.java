package com.example.bakeryProject.controller;

import com.example.bakeryProject.dto.OrderDTO;
import com.example.bakeryProject.service.imp.OrderServiceImp;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private final OrderServiceImp orderService;

    @GetMapping("/order_all")
    public List<OrderDTO> getAllOrders() {
        return orderService.getAllOrders ();
    }

    @GetMapping("/order/{id}")
    public OrderDTO getOrderById(@PathVariable final long id) {

        return orderService.findOrderById (id);
    }


    @PutMapping("/orders")
    public OrderDTO updateOrder(@RequestBody @Validated final OrderDTO orderDTO) {
        return orderService.updateOrder (orderDTO);
    }


    @DeleteMapping("/orders/{id}")
    public ResponseEntity deleteOrderById(@PathVariable final long id) {
        orderService.deleteOrderById (id);
        return ResponseEntity.ok().build();
    }
}
