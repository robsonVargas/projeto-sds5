package com.robson.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robson.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
}
