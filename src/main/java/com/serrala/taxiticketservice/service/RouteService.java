package com.serrala.taxiticketservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serrala.taxiticketservice.config.Route;
import com.serrala.taxiticketservice.config.RouteConfig;
import com.serrala.taxiticketservice.exception.RouteNotFoundException;
import com.serrala.taxiticketservice.model.BookingRequest;

@Service
public class RouteService {
	@Autowired
	RouteConfig routeConfig;
	
	public int getDistanceFromRoute(BookingRequest bookingRequest) {
		List<Route> routeMap = routeConfig.getRouteMap();
		Optional<Route> routeInfo = routeMap.stream().filter(route-> (route.getDestination().equals(bookingRequest.getDestination()) && 
				route.getSource().equals(bookingRequest.getSource()))).findFirst();
		if(routeInfo.isPresent())
			return routeInfo.get().getDistance();
		else throw new RouteNotFoundException(bookingRequest.getSource()+"->"+bookingRequest.getDestination()
		+": does not exist.");
	}

}
