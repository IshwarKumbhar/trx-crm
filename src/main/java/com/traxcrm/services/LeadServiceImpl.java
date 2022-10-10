package com.traxcrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traxcrm.entities.Lead;
import com.traxcrm.repositories.LeadRepository;
@Service
public class LeadServiceImpl implements LeadService {
@Autowired
private LeadRepository leadrepo;
	@Override
	public void SaveLead(Lead lead) {
		leadrepo.save(lead);

	}
	@Override
	public Lead getLeadById(long id) {
		Optional<Lead> findbyId = leadrepo.findById(id);
		Lead lead = findbyId.get();
		return lead;
	}
	@Override
	public void deleteOneLead(long id) {
		leadrepo.deleteById(id);
		
	}
	@Override
	public List<Lead> listAll() {
		List<Lead> leads = leadrepo.findAll();
		return leads;
	}

}
