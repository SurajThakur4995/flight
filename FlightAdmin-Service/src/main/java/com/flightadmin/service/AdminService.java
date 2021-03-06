package com.flightadmin.service;

import java.util.List;

import com.flightadmin.dto.FlightDetailsDTO;
import com.flightadmin.dto.ResponseFlightDetailsDTO;
import com.flightadmin.dto.UserServiceRequestDTO;
import com.flightadmin.dto.UserServiceResponseDTO;

public interface AdminService {

	ResponseFlightDetailsDTO addFlightDetails(FlightDetailsDTO flightDetailsDTO);

	void blockedFlight(String airline);

	List<UserServiceResponseDTO> getFlightDetails(UserServiceRequestDTO userServiceRequestDTO);
	
	

}
