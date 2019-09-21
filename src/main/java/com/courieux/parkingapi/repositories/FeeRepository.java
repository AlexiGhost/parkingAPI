package com.courieux.parkingapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courieux.parkingapi.entities.Fee;

public interface FeeRepository extends JpaRepository<Fee, Long> {

}
