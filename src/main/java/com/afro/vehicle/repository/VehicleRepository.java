package com.afro.vehicle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afro.vehicle.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long>{

	public Vehicle getByVehicleId(Long vehicleId); 
	public List<Vehicle> getByCustomerId(Long customerId) ;
}
