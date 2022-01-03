package com.afro.vehicle.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.afro.vehicle.model.Vehicle;
import com.afro.vehicle.service.VehicleService;


@RestController
@RequestMapping("/vehicles")
public class VehicleController {

	private VehicleService vehicleService ;

	public VehicleController(VehicleService vehicleService) {
		super();
		this.vehicleService = vehicleService;
	} 
	
	
	
	// save vehicle end poing 
	@PostMapping("/")
	public Vehicle saveVehicle(@RequestBody Vehicle vehicle)
	{
		return vehicleService.saveVehicle(vehicle);
	}
	
	
	// get vehicle end point
	@GetMapping("/{id}")
	public Vehicle getVehilce(@PathVariable Long id)
	{
		return vehicleService.getVehicle(id);
	}
	
	// get vehicle end point
	@GetMapping("/customer/{id}")
		public List<Vehicle> getVehilceByCustomerID(@PathVariable Long id)
		{
			return vehicleService.getVehiclesByCustomer(id);
		}
}
