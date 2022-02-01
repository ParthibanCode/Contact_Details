package com.example.contact.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.contact.ContactRepository;
import com.example.contact.entity.Contact;

@Service
public class ContactService {
	
	@Autowired
	ContactRepository contactRepository;
	
	public void createContact(Contact contact) {
		contactRepository.save(contact);
	}
	
	public Iterable<Contact> getContacts() {
		return contactRepository.findAll();
	}
	
	public void deleteContactbyId(Integer id) {
		contactRepository.deleteById(id);
	}
}
