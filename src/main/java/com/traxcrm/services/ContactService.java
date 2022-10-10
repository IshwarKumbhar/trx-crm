package com.traxcrm.services;

import java.util.List;

import com.traxcrm.entities.contact;


public interface ContactService {
 public void saveContact(contact con);

public List<contact> listAll();

public contact findById(long id);


}
