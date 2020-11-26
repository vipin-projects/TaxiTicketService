package com.serrala.taxiticketservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {
	@Value("${maxTraveller5}")
	int maxNoOfTravellersFor5Seater;
	
	@Value("${maxTraveller7}")
	int maxNoOfTravellersFor7Seater;
	
	@Value("${maxTraveller9}")
	int maxNoOfTravellersFor9Seater;

	/**
	 * @return the maxNoOfTravellersFor5Seater
	 */
	public int getMaxNoOfTravellersFor5Seater() {
		return maxNoOfTravellersFor5Seater;
	}

	/**
	 * @param maxNoOfTravellersFor5Seater the maxNoOfTravellersFor5Seater to set
	 */
	public void setMaxNoOfTravellersFor5Seater(int maxNoOfTravellersFor5Seater) {
		this.maxNoOfTravellersFor5Seater = maxNoOfTravellersFor5Seater;
	}

	/**
	 * @return the maxNoOfTravellersFor7Seater
	 */
	public int getMaxNoOfTravellersFor7Seater() {
		return maxNoOfTravellersFor7Seater;
	}

	/**
	 * @param maxNoOfTravellersFor7Seater the maxNoOfTravellersFor7Seater to set
	 */
	public void setMaxNoOfTravellersFor7Seater(int maxNoOfTravellersFor7Seater) {
		this.maxNoOfTravellersFor7Seater = maxNoOfTravellersFor7Seater;
	}

	/**
	 * @return the maxNoOfTravellersFor9Seater
	 */
	public int getMaxNoOfTravellersFor9Seater() {
		return maxNoOfTravellersFor9Seater;
	}

	/**
	 * @param maxNoOfTravellersFor9Seater the maxNoOfTravellersFor9Seater to set
	 */
	public void setMaxNoOfTravellersFor9Seater(int maxNoOfTravellersFor9Seater) {
		this.maxNoOfTravellersFor9Seater = maxNoOfTravellersFor9Seater;
	}
	
	
}
