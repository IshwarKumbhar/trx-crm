package com.traxcrm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traxcrm.entities.billing;
import com.traxcrm.repositories.billling_repositories;

@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	private billling_repositories billingrepo;
	
	@Override
	public void savebill(billing bill) {
		 billingrepo.save(bill);
		
	}

	@Override
	public List<billing> listallbills() {
		List<billing> bill = billingrepo.findAll();
		return bill;
	}

}
