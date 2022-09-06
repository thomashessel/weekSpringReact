package com.treinoweekspringreact.repositories;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.treinoweekspringreact.entities.Product;

@Component
public class ProductRepository {
	
	private Map<Long, Product> map = new HashMap<>();
		
	public void save(Product produto) {
		map.put(produto.getId(), produto);
	}
	
	public List<Product> findAll(){
		return new ArrayList<Product>(map.values());
	}
	
	public Product findById(Long id) {
		return map.get(id);
	}

}
