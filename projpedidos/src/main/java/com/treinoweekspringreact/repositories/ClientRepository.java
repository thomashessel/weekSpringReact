package com.treinoweekspringreact.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.treinoweekspringreact.entities.Client;

@Component
public class ClientRepository {

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
}
