package com.flightuser.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="Flight_Registration_Details")
public class FlightRegistrationDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="PNR_Number",unique=true)
	private String pNR_Number;
	@Column(name="Flight_Id",nullable=true)
	private int flightId;
	@Column(name="Name",nullable=false)
	private String name;
	@Column(name="EmailID",unique=true)
	private String emailID;
	@OneToMany(cascade =CascadeType.ALL,fetch=FetchType.EAGER,mappedBy="flightRegistrationDTO")
	private List<PassengerDTO> passengers;
	@Column(name="No_Of_Passenger")
	private int noOfPassenger;
	@Column(name="Opt_For_Meal")
	private boolean meal;
	@Enumerated(EnumType.STRING)
	private TypeOfMeal typeOfMeal;
	
	
	
	public FlightRegistrationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public FlightRegistrationDTO(int id, String pNR_Number, int flightId, String name, String emailID,
			List<PassengerDTO> passengers, int noOfPassenger, boolean meal, TypeOfMeal typeOfMeal) {
		super();
		this.id = id;
		this.pNR_Number = pNR_Number;
		this.flightId = flightId;
		this.name = name;
		this.emailID = emailID;
		this.passengers = passengers;
		this.noOfPassenger = noOfPassenger;
		this.meal = meal;
		this.typeOfMeal = typeOfMeal;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPNR_Number() {
		return pNR_Number;
	}
	public void setPNR_Number(String pNR_Number) {
		this.pNR_Number = pNR_Number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
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
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public List<PassengerDTO> getPassengers() {
		return passengers;
	}
	public void setPassengers(List<PassengerDTO> passengers) {
		this.passengers = passengers;
	}
	
	
	
	
	
	
	
	

}
