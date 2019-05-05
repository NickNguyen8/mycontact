package com.vmo.mycontact.services;

import com.vmo.mycontact.entities.Contact;

import java.util.List;
import java.util.Optional;

public interface ContactService {

	List<Contact> findAll();
	
    List<Contact> search(String term);
    
    Optional<Contact> findById(Integer id);
    
    void save(Contact contact);

	void delete(Integer id);

}