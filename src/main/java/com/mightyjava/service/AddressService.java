package com.mightyjava.service;

import java.util.List;

import com.mightyjava.model.Address;

public interface AddressService {
	List<Address> addressList();
	
	Address findOne(Long id);
	
	Address addAddress(Address address);
	
	String deleteAddress(Long id);
}
