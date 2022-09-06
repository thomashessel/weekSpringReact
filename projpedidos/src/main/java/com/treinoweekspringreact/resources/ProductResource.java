package com.treinoweekspringreact.resources;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treinoweekspringreact.entities.Product;
import com.treinoweekspringreact.repositories.ProductRepository;

@RestController
@RequestMapping(value="/products")
public class ProductResource {

	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping
	public ResponseEntity<List<Product>> fidAll() throws ParseException{
		List<Product> cli = productRepository.findAll();
		return ResponseEntity.ok().body(cli);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) throws ParseException{
		Product cli = productRepository.findById(id);
		return ResponseEntity.ok().body(cli);
	}
}
