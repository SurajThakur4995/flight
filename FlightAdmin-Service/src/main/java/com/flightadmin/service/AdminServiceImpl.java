package com.flightadmin.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import com.flightadmin.dao.AdminRepository;
import com.flightadmin.dto.FlightDetailsDTO;
import com.flightadmin.dto.ResponseFlightDetailsDTO;
import com.flightadmin.dto.UserServiceRequestDTO;
import com.flightadmin.dto.UserServiceResponseDTO;

@Service
public class AdminServiceImpl implements AdminService {
	
	private final AdminRepository adminRepository;
	private final ModelMapper modelMapper;

	public AdminServiceImpl(AdminRepository adminRepository,ModelMapper modelMapper) {
		super();
		this.adminRepository = adminRepository;
		this.modelMapper= modelMapper;
	}

	@Override
	public ResponseFlightDetailsDTO addFlightDetails(FlightDetailsDTO flightDetailsDTO) {
		Random random = new Random();
		//flightDetailsDTO.setId( random.nextInt());
		
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		adminRepository.save(flightDetailsDTO);
		ResponseFlightDetailsDTO responseFlightDetailsDTO = modelMapper.map(flightDetailsDTO, ResponseFlightDetailsDTO.class);
		
		return responseFlightDetailsDTO;
	
}

	@Override
	public void blockedFlight(String airline) {
		adminRepository.setFlightDetailsByAirline(airline);
		
	}

	@Override
	public List<UserServiceResponseDTO> getFlightDetails(UserServiceRequestDTO userServiceRequestDTO) {
		UserServiceResponseDTO userServiceResponseDTO = new UserServiceResponseDTO();
		List<UserServiceResponseDTO> list = new ArrayList<>();
		List<FlightDetailsDTO> listOfFlights=	adminRepository.getFlightDetails(
				userServiceRequestDTO.getFromPlace(),userServiceRequestDTO.getToPlace()	);
		userServiceResponseDTO.setDate(listOfFlights.get(0).getStartDate());
		userServiceResponseDTO.setFlightId(listOfFlights.get(0).getFlightNo());
		userServiceResponseDTO.setFlightName(listOfFlights.get(0).getAirline());
		userServiceResponseDTO.setFlightPrice(String.valueOf(listOfFlights.get(0).getCost()));
		list.add(userServiceResponseDTO);
		return list;
	}	

}
