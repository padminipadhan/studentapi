package com.client.sample.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.client.sample.beans.Client;

@RestController
public class ClientController {
	
	@GetMapping(value="/getAllClient")
	public List<Client> getAllClient(){
		List<Client> clientList= new ArrayList<>();
		Client cList= new Client();
		cList.setId(101);
		cList.setName("Padmini");
		cList.setPhNum("9011535789");
		clientList.add(cList);
		return clientList;
		

		
		
	}
		
}

