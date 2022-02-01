package com.example.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.contact.entity.Contact;
import com.example.contact.service.ContactService;

@RestController
public class ContactController {
	
	@Autowired
	ContactService contactService;
	
	@PostMapping("/create")
	@ResponseStatus(code = HttpStatus.CREATED)
	void createNewContact(@RequestBody Contact contact) {
		System.out.println(contact.getCity());
		contactService.createContact(contact);
	}

}
