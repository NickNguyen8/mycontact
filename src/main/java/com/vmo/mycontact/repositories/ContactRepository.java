package com.vmo.mycontact.repositories;

import com.vmo.mycontact.entities.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ContactRepository extends CrudRepository <Contact, Integer>{
	List<Contact> findByNameContaining(String term);
}
