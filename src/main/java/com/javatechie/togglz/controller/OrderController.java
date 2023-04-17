package com.javatechie.togglz.controller;

import com.javatechie.togglz.dto.OrderDTO;
import com.javatechie.togglz.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/togglz")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/all")
    public List<OrderDTO> getAlOrders(){
        return orderService.getAllOrders();
    }
}
