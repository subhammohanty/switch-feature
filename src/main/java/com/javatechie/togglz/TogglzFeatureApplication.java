package com.javatechie.togglz;

import com.javatechie.togglz.dto.OrderDTO;
import com.javatechie.togglz.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.togglz.core.Feature;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.util.NamedFeature;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class TogglzFeatureApplication {

//	@Autowired
//	private FeatureManager manager;

//	public static final Feature DISCOUNT_APPLIED = new NamedFeature("DISCOUNT_APPLIED");
//
//	@Autowired
//	private OrderService orderService;


//	@GetMapping("/orders")
//	public List<OrderDTO> showAvailableProducts() {
//		if (manager.isActive(DISCOUNT_APPLIED)) {
//			return applyDiscount(orderService.getAllOrders());
//		} else {
//			return orderService.getAllOrders();
//		}
//	}
//
//	private List<OrderDTO> applyDiscount(List<OrderDTO> availableProducts) {
//		List<OrderDTO> orderListAfterDiscount = new ArrayList<>();
//		orderService.getAllOrders().forEach(order -> {
//			order.setPrice(order.getPrice() - (order.getPrice() * 5 / 100));
//			orderListAfterDiscount.add(order);
//		});
//		return orderListAfterDiscount;
//	}

	public static void main(String[] args) {
		SpringApplication.run(TogglzFeatureApplication.class, args);
	}

}
