package com.courieux.parkingapi.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.courieux.parkingapi.entities.Parking;
import com.courieux.parkingapi.repositories.ParkingRepository;

@Service
public class ParkingServiceImpl implements ParkingService {

	private final ParkingRepository parkingRepository;
	
	public ParkingServiceImpl(ParkingRepository parkingRepository) {
		this.parkingRepository = parkingRepository;
	}
	
	@Override
	public Parking getParkingById(Long id) {
		return parkingRepository.findById(id).get();
	}

	@Override
	public List<Parking> getAllParkings() {
		return parkingRepository.findAll();
	}

}
