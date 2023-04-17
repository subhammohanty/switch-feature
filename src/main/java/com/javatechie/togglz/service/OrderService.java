package com.javatechie.togglz.service;

import com.javatechie.togglz.dto.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.togglz.core.Feature;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.util.NamedFeature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

    @Autowired
    private FeatureManager manager;

    public static final Feature DISCOUNT_APPLIED = new NamedFeature("DISCOUNT_APPLIED");


    private List<OrderDTO> getOrderList(){
        return Arrays.asList(new OrderDTO(1, "Mobile", 20000),
                new OrderDTO(2, "T.v", 30000),
                new OrderDTO(3, "Laptop", 40000));
    }


    public List<OrderDTO> getAllOrders(){
        if(manager.isActive(DISCOUNT_APPLIED)){
            return getDiscountedOrders(getOrderList());
        }else {
            return getOrderList();
        }
    }

    private List<OrderDTO> getDiscountedOrders(List<OrderDTO> orderList) {
        return orderList.stream()
                .map(order -> {
                    order.setPrice(order.getPrice() - ((order.getPrice() * 5) / 100));
                    return order;
                }).collect(Collectors.toList());
    }
}
