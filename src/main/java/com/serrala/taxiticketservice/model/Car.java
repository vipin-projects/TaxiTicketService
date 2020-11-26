package com.serrala.taxiticketservice.model;

/**
 * Added this class to handle future enhancements related to Cars
 * @author Vipin
 *
 */
public class Car {
	String type;
	int maxNoOfTravellers;
	String registrationNumber;
	
	public Car(String type, int maxNoOfTravellers, String registrationNumber) {
		this.type = type;
		this.maxNoOfTravellers = maxNoOfTravellers;
		this.registrationNumber = registrationNumber;
	}
	/**
	 * @return the registrationNumber
	 */
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	/**
	 * @param registrationNumber the registrationNumber to set
	 */
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the maxNoOfTravellers
	 */
	public int getMaxNoOfTravellers() {
		return maxNoOfTravellers;
	}
	/**
	 * @param maxNoOfTravellers the maxNoOfTravellers to set
	 */
	public void setMaxNoOfTravellers(int maxNoOfTravellers) {
		this.maxNoOfTravellers = maxNoOfTravellers;
	}
	
	
}
