package com.serrala.taxiticketservice.model;

public class BookingRequest {
	String source;
	String destination;
	int noOfTravellers;
	
	public BookingRequest(String source, String destination, int noOfTravellers) {
		this.source = source;
		this.destination = destination;
		this.noOfTravellers = noOfTravellers;
	}
	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}
	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}
	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}
	/**
	 * @return the noOfTravellers
	 */
	public int getNoOfTravellers() {
		return noOfTravellers;
	}
	/**
	 * @param noOfTravellers the noOfTravellers to set
	 */
	public void setNoOfTravellers(int noOfTravellers) {
		this.noOfTravellers = noOfTravellers;
	}
	
	
}
