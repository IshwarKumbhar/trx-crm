package com.traxcrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.traxcrm.entities.contact;

public interface ContactRepository extends JpaRepository<contact, Long> {

}
