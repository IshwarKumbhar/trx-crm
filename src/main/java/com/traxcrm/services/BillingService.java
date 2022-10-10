package com.traxcrm.services;

import java.util.List;

import com.traxcrm.entities.billing;

public interface BillingService {

	public void savebill(billing bill);

	public List<billing> listallbills();

}
