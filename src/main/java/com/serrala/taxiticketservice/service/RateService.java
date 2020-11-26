package com.serrala.taxiticketservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serrala.taxiticketservice.config.PriceConfig;

@Service
public class RateService {
	@Autowired
	PriceConfig priceConfig;
	
	public int calculateFareBasedOnDistance(int distance) {
		int firstDistance = priceConfig.getFirstDistanceUpto();
		int firstDistanceRate = priceConfig.getFirstDistanceRate();
		
		if(distance <= firstDistance)
			return firstDistanceRate;
		
		return (distance-firstDistance)*priceConfig.getPerKMRate()+firstDistanceRate;
	}
	
	public int calculateFareBasedOnDistanceAndTraveller(int distance, int noOfTrvlrs) {
		return calculateFareBasedOnDistance(distance)*noOfTrvlrs
				;
	}
}













































































































































