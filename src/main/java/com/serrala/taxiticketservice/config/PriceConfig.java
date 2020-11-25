package com.serrala.taxiticketservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PriceConfig {
	@Value("${first.distance}")
	int firstDistanceUpto;
	@Value("${first.distance.rate}")
	int firstDistanceRate;
	@Value("${perkm.rate}")
	int perKMRate;
	
	public int getFirstDistanceUpto() {
		return firstDistanceUpto;
	}
	public void setFirstDistanceUpto(int firstDistanceUpto) {
		this.firstDistanceUpto = firstDistanceUpto;
	}
	public int getFirstDistanceRate() {
		return firstDistanceRate;
	}
	public void setFirstDistanceRate(int firstDistanceRate) {
		this.firstDistanceRate = firstDistanceRate;
	}
	public int getPerKMRate() {
		return perKMRate;
	}
	public void setPerKMRate(int perKMRate) {
		this.perKMRate = perKMRate;
	}
		
}
