package com.traxcrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traxcrm.entities.contact;
import com.traxcrm.repositories.ContactRepository;
@Service
public class contactServiceImpl implements ContactService {

	@Autowired
	ContactRepository contactRepo;
	
	@Override
	public void saveContact(contact con) {
		contactRepo.save(con);
		
	}

	@Override
	public List<contact> listAll() {
		List<contact> contacts = contactRepo.findAll();
		return contacts;
	}

	@Override
	public contact findById(long id) {
		Optional<contact> con = contactRepo.findById(id);
		contact conta = con.get();
		return conta;
	}


}
