package com.treinoweekspringreact.resources;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treinoweekspringreact.entities.OrderItem;
import com.treinoweekspringreact.repositories.OrderItemRepository;

@RestController
@RequestMapping(value="/orderItens")
public class OrderItemResource {

	
	@Autowired
	private OrderItemRepository orderItemRepository;
	
	@GetMapping
	public ResponseEntity<List<OrderItem>> fidAll() throws ParseException{
		List<OrderItem> cli = orderItemRepository.findAll();
		return ResponseEntity.ok().body(cli);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<OrderItem> findById(@PathVariable Long id) throws ParseException{
		OrderItem cli = orderItemRepository.findById(id).get();
		return ResponseEntity.ok().body(cli);
	}
	
	@PostMapping
	public OrderItem save(@RequestBody OrderItem newOrderItem) {
		OrderItem result = orderItemRepository.save(newOrderItem);
		return result;
		}
}
