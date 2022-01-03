package com.afro.vehicle.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_INS_VEHICLE")
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "VEHICLE_ID")
	private Long vehicleId ; 
	
	@Column(name = "CHASSI_NO")
	private String chassiNo ; 
	
	@Column(name = "BRAND")
	private String brand ; 
	
	@Column(name = "MODEL")
	private String model ; 
	
	@Column(name = "CUSTOMER_ID" , nullable = false)
	private Long customerId ;

	public Long getVehicleId() {
		return vehicleId;
	}

	public String getChassiNo() {
		return chassiNo;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setVehicleId(Long vehicleId) {
		this.vehicleId = vehicleId;
	}

	public void setChassiNo(String chassiNo) {
		this.chassiNo = chassiNo;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	} 
	
	
}
