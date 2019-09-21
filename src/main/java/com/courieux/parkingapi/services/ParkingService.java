package com.courieux.parkingapi.services;

import java.util.List;

import com.courieux.parkingapi.entities.Parking;

public interface ParkingService {
	Parking getParkingById(Long id);
	List<Parking> getAllParkings();
}
