package com.afro.vehicle.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.afro.vehicle.model.Vehicle;
import com.afro.vehicle.repository.VehicleRepository;

@Service
public class VehicleServiceImpl implements VehicleService{

	private VehicleRepository vehicleRepository ; 
	
	
	
	public VehicleServiceImpl(VehicleRepository vehicleRepository) {
		super();
		this.vehicleRepository = vehicleRepository;
	}

	
	@Override
	public List<Vehicle> getAllVehicle() {
		return vehicleRepository.findAll();
	}

	@Override
	public Vehicle getVehicle(Long pk) {
		return vehicleRepository.getByVehicleId(pk);
	}

	@Override
	public Vehicle saveVehicle(Vehicle model) {
		return vehicleRepository.save(model);
	}

	@Override
	public Vehicle updateVehicle(Vehicle model) {
		return vehicleRepository.save(model);
	}


	@Override
	public List<Vehicle> getVehiclesByCustomer(Long customerId) {
		// TODO Auto-generated method stub
		return vehicleRepository.getByCustomerId(customerId);
	}

}
