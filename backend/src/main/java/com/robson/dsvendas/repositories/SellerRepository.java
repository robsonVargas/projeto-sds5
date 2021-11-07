package com.robson.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robson.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{
	
}
