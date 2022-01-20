package com.flightadmin.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flightadmin.dto.FlightDetailsDTO;
import com.flightadmin.dto.UserServiceRequestDTO;
import com.flightadmin.dto.UserServiceResponseDTO;

@Repository
public interface AdminRepository extends JpaRepository<FlightDetailsDTO,Long>{
	
	@Modifying
	@Query(nativeQuery=true,value="update flight_details f set f.blocked_flight='true' where f.airline_name=?1")
	public void setFlightDetailsByAirline(String airline);
	
	@Query(nativeQuery=true,value="select "
			+ "* from flight_details f where "
			+ "  f.from_place =?1 and f.to_place=?2")
	public List<FlightDetailsDTO> getFlightDetails( String fromPlace,String toPlace );

}
