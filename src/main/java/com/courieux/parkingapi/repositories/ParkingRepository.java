package com.courieux.parkingapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courieux.parkingapi.entities.Parking;

public interface ParkingRepository extends JpaRepository<Parking, Long> {

}
