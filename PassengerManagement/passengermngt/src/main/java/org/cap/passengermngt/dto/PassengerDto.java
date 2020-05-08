package org.cap.passengermngt.dto;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.ElementCollection;

import org.cap.passengermngt.entities.Passenger;

public class PassengerDto {

	private String passengerName;
	private Integer passengerAge;
	private BigInteger passengerPnrNo;
	private double luggage;
	
	public PassengerDto() {
		super();
	}
	
	public PassengerDto(String passengerName, Integer passengerAge, BigInteger passengerPnrNo, double luggage) {
		super();
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.passengerPnrNo = passengerPnrNo;
		this.luggage = luggage;

	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public Integer getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(Integer passengerAge) {
		this.passengerAge = passengerAge;
	}

	public BigInteger getPassengerPnrNo() {
		return passengerPnrNo;
	}

	public void setPassengerPnrNo(BigInteger passengerPnrNo) {
		this.passengerPnrNo = passengerPnrNo;
	}

	public double getLuggage() {
		return luggage;
	}

	public void setLuggage(double luggage) {
		this.luggage = luggage;
	}
	

}
