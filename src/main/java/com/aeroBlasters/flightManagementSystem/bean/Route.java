package com.aeroBlasters.flightManagementSystem.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Route {
	
	@Id
	private Long routeId;
	private String sourceAirportCode;
	private String destinationAirportCode;
	public Route() {
		super();
		
	}
	
	public Route(Long routeId, String sourceAirportCode, String destinationAirportCode) {
		super();
		this.routeId = routeId;
		this.sourceAirportCode = sourceAirportCode;
		this.destinationAirportCode = destinationAirportCode;
	}

	public Long getRouteId() {
		return routeId;
	}

	public void setRouteId(Long routeId) {
		this.routeId = routeId;
	}

	public String getSourceAirportCode() {
		return sourceAirportCode;
	}

	public void setSourceAirportCode(String sourceAirportCode) {
		this.sourceAirportCode = sourceAirportCode;
	}

	public String getDestinationAirportCode() {
		return destinationAirportCode;
	}

	public void setDestinationAirportCode(String destinationAirportCode) {
		this.destinationAirportCode = destinationAirportCode;
	}
	
	
	
	
}
