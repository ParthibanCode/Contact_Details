package com.example.contact.service;

import java.util.Optional;

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
	
	public Optional<Contact> getContactbyId(Integer id) {
		return contactRepository.findById(id);
	}
	
	public void updateContactbyId(Contact contact, Integer id) {
		Contact c1 = contactRepository.findById(id).get();
		if(contact.getHouseNum()!=0) {
			c1.setHouseNum(contact.getHouseNum());
		}
		if(contact.getStreet()!="") {
			c1.setStreet(contact.getStreet());
		}
		if(contact.getCity()!="") {
			c1.setCity(contact.getCity());
		}
		if(contact.getFirstName()!="") {
			c1.setFirstName(contact.getFirstName());
		}
		if(contact.getLastName()!="") {
			c1.setLastName(contact.getLastName());
		}
		if(contact.getAge()!=0) {
			c1.setAge(contact.getAge());
		}
		if(contact.getMobNum1()!="") {
			c1.setMobNum1(contact.getMobNum1());
		}
		if(contact.getMobNum2()!="") {
			c1.setMobNum2(contact.getMobNum2());
		}
		if(contact.getMobNum3()!="") {
			c1.setMobNum3(contact.getMobNum3());
		}
		contactRepository.save(c1);
	}
	
	public void deleteContactbyId(Integer id) {
		contactRepository.deleteById(id);
	}
}
