package com.suraj.springweb.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

/** Represents a car which is located in a car dealership
 * @author Daljeet Singh
 * @version 1.0
 */
public class Car implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;
	private int id;
	private String make;
	private String model;
	private String colour;
	private double price;
	private String vin;
	private String dealership;
	
	//To use for moving car from one dealership to another
	private String newDealership;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getMake() {
		return make;
	}



	public void setMake(String make) {
		this.make = make;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public String getColour() {
		return colour;
	}



	public void setColour(String colour) {
		this.colour = colour;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getVin() {
		return vin;
	}



	public void setVin(String vin) {
		this.vin = vin;
	}



	public String getDealership() {
		return dealership;
	}



	public void setDealership(String dealership) {
		this.dealership = dealership;
	}



	public String getNewDealership() {
		return newDealership;
	}



	public void setNewDealership(String newDealership) {
		this.newDealership = newDealership;
	}



	public String[] getDealerships() {
		return dealerships;
	}



	public void setDealerships(String[] dealerships) {
		this.dealerships = dealerships;
	}



	//Dealership names
	private String[] dealerships = {"New Cars","Second Hand Cars","Super Cars"};
}