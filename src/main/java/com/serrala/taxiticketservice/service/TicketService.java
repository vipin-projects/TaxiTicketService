package com.serrala.taxiticketservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serrala.taxiticketservice.builder.TicketResponseBuilder;
import com.serrala.taxiticketservice.exception.RouteNotFoundException;
import com.serrala.taxiticketservice.model.BookingRequest;
import com.serrala.taxiticketservice.model.TicketResponse;

@Service
public class TicketService {

	@Autowired
	RateService rateService;
	@Autowired
	RouteService routeService;
	
	public TicketResponse bookTicket(BookingRequest bookingRequest) {
		int distance = routeService.getDistanceFromRoute(bookingRequest);
		int fare = rateService.calculateFareBasedOnDistanceAndTraveller(distance, bookingRequest.getNoOfTravellers());
		return buildTicketResponse(bookingRequest, distance, fare);
	}

	private TicketResponse buildTicketResponse(BookingRequest bookingRequest, int distance, int fare) {
		return TicketResponseBuilder.getInstance().buildTicketResponse(bookingRequest, distance, fare);
	}
}
