package com.treinoweekspringreact.resources;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treinoweekspringreact.entities.Order;
import com.treinoweekspringreact.repositories.OrderRepository;

@RestController
@RequestMapping(value="/orders")
public class OrderResource {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@GetMapping
	public ResponseEntity<List<Order>> fidAll() throws ParseException{
		List<Order> cli = orderRepository.findAll();
		return ResponseEntity.ok().body(cli);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) throws ParseException{
		Order cli = orderRepository.findById(id);
		return ResponseEntity.ok().body(cli);
	}

}
