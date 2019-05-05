package com.vmo.mycontact.services.impl;

import com.vmo.mycontact.entities.Contact;
import com.vmo.mycontact.repositories.ContactRepository;
import com.vmo.mycontact.services.ContactService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
    private ContactRepository contactRepository;
    
//    public ContactServiceImpl (ContactRepository contactRepository) {
//    	this.contactRepository = contactRepository;
//    }
    
    @Override
    public List<Contact> findAll() {
        return (List<Contact>) contactRepository.findAll();
    }

    @Override
    public List<Contact> search(String term) {
        return contactRepository.findByNameContaining(term);
    }

    @Override
    public Optional<Contact> findById(Integer id) {
        return contactRepository.findById(id);
    }

    @Override
    public void save(Contact contact) {
        contactRepository.save(contact);
    }

    @Override
    public void delete(Integer id) {
        contactRepository.deleteById(id);
    }
}
