package com.flightuser.shared;

import java.util.List;

import com.flightuser.dto.PassengerDTO;
import com.flightuser.dto.TypeOfMeal;

public class UserDTO {

	private String pNR_Number;
	private int flightId;
	private String name;
	private String emailId;
	private List<PassengerDTO> passengers;
	private int noOfPassenger;
	private boolean meal;
	private TypeOfMeal typeOfMeal;
	
	public String getPNR_Number() {
		return pNR_Number;
	}
	public void setPNR_Number(String pNR_Number) {
		this.pNR_Number = pNR_Number;
	}
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


