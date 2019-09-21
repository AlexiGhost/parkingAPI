package com.courieux.parkingapi.services;

import org.springframework.stereotype.Service;

import com.courieux.parkingapi.repositories.FeeRepository;

@Service
public class FeeServiceImpl implements FeeService {

	private final FeeRepository feeRepository;
	
	public FeeServiceImpl(FeeRepository feeRepository) {
		this.feeRepository = feeRepository;
	}
}
