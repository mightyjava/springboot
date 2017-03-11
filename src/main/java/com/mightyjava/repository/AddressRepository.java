package com.mightyjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mightyjava.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
