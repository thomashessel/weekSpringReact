package com.treinoweekspringreact.resources;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treinoweekspringreact.entities.Client;
import com.treinoweekspringreact.repositories.ClientRepository;

@RestController
@RequestMapping(value="/clients")
public class ClientResource {
	
	@Autowired
	private ClientRepository clientRepository;
	
	@GetMapping
	public ResponseEntity<List<Client>> fidAll() throws ParseException{
		List<Client> cli = clientRepository.findAll();
		return ResponseEntity.ok().body(cli);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Client> findById(@PathVariable Long id) throws ParseException{
		Client cli = clientRepository.findById(id);
		return ResponseEntity.ok().body(cli);
	}
}
