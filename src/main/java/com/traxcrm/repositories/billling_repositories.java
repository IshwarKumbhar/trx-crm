package com.traxcrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.traxcrm.entities.billing;
@Repository
public interface billling_repositories extends JpaRepository<billing, Long> {

}
