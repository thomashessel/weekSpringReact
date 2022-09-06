package com.treinoweekspringreact.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.treinoweekspringreact.entities.Order;

@Component
public class OrderRepository {

	private Map<Long, Order> map = new HashMap<>();
	public void save(Order order) {
		map.put(order.getId(), order);
	}
	public Order findById(Long id) {
		return map.get(id);
	}
	public List<Order> findAll(){
		return new ArrayList<Order>(map.values());
	}
	
}
