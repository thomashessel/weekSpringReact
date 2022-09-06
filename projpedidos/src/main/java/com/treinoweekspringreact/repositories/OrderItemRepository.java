package com.treinoweekspringreact.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.treinoweekspringreact.entities.OrderItem;

@Component
public class OrderItemRepository {

	private Map<Long, OrderItem> map = new HashMap<>();
	
	public void save(OrderItem item) {
		map.put(item.getId(), item);
	}
	public OrderItem findById(Long id) {
		return map.get(id);
	}
	public List<OrderItem> findAll(){
		return new ArrayList<OrderItem>(map.values());
	}
}
