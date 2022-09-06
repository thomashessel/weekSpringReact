package com.treinoweekspringreact.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.treinoweekspringreact.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	/* Versão original para OO em framewordk do JPA
	 * import org.springframework.stereotype.Component;
	 * 
	 * @Component
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
*/
}
