package com.example.contact;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.contact.entity.Contact;

public interface ContactRepo extends JpaRepository<Contact, Integer> {

}
