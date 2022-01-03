package com.afro.vehicle.service;

import java.util.List;

import com.afro.vehicle.model.Vehicle;

public interface VehicleService {

	public List<Vehicle> getAllVehicle();

	public Vehicle getVehicle(Long pk);
	
	public List<Vehicle> getVehiclesByCustomer(Long customerId);

	public Vehicle saveVehicle(Vehicle model);

	public Vehicle updateVehicle(Vehicle model);

}
