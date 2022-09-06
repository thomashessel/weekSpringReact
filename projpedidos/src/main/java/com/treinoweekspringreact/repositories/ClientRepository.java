package com.treinoweekspringreact.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.treinoweekspringreact.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

	
	
	/* Versão original para OO em framewordk do JPA
	 * import org.springframework.stereotype.Component;
	 * 
	 * @Component
	private Map<Long, Client> map = new HashMap<>();
	public void save(Client client) {
		map.put(client.getId(), client);
	}
	public Client findById(Long id) {
		return map.get(id);
	}
	public List<Client> findAll(){
		return new ArrayList<Client>(map.values());
	}
	
	*/
}
