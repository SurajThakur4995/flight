package com.flightuser.dto;

import java.util.List;

public class FlightRequestDTO {
	
	private int flightId;
	private String name;
	private String emailId;
	private List<PassengerDTO> passengers;
	private int noOfPassenger;
	private boolean meal;
	private TypeOfMeal typeOfMeal;
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public List<PassengerDTO> getPassengers() {
		return passengers;
	}
	public void setPassengers(List<PassengerDTO> passengers) {
		this.passengers = passengers;
	}
	public int getNoOfPassenger() {
		return noOfPassenger;
	}
	public void setNoOfPassenger(int noOfPassenger) {
		this.noOfPassenger = noOfPassenger;
	}
	public boolean isMeal() {
		return meal;
	}
	public void setMeal(boolean meal) {
		this.meal = meal;
	}
	public TypeOfMeal getTypeOfMeal() {
		return typeOfMeal;
	}
	public void setTypeOfMeal(TypeOfMeal typeOfMeal) {
		this.typeOfMeal = typeOfMeal;
	}
	
	

}
