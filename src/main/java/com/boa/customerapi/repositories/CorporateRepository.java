package com.boa.customerapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boa.customerapi.models.Corporate;

public interface CorporateRepository extends JpaRepository<Corporate, Long>{

}
