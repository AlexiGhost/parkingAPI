package com.courieux.parkingapi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.courieux.parkingapi.entities.Parking;
import com.courieux.parkingapi.services.ParkingService;

@RestController
@RequestMapping(ParkingController.BASE_URL)
public class ParkingController {
	public static final String BASE_URL = "/api/v1/parkings";
	
	private ParkingService parkingService;
	
	public ParkingController(ParkingService parkingService) {
		super();
		this.parkingService = parkingService;
	}
	
	@GetMapping
	public List<Parking> getAllParkings() {
		return parkingService.getAllParkings();
	}
	
	@GetMapping("/{id}")
	public Parking getParkingById(@PathVariable Long id) {
		return parkingService.getParkingById(id);
	}
	
}
