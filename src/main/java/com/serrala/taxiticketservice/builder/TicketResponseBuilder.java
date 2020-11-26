package com.serrala.taxiticketservice.builder;

import com.serrala.taxiticketservice.model.BookingRequest;
import com.serrala.taxiticketservice.model.TicketResponse;

public class TicketResponseBuilder {
	private static TicketResponseBuilder ticketResponseBuilder = new TicketResponseBuilder();
	
	//private constructor
	private TicketResponseBuilder() {
		
	}
	
	public static TicketResponseBuilder getInstance() {
		return ticketResponseBuilder;
	}
	
	public TicketResponse buildTicketResponse(BookingRequest bookingRequest, int distance, int fare) {
		TicketResponse ticketResponse = new TicketResponse();
		ticketResponse.setSource(bookingRequest.getSource());
		ticketResponse.setDestination(bookingRequest.getDestination());
		ticketResponse.setNoOfTravellers(bookingRequest.getNoOfTravellers());
		ticketResponse.setDistance(distance);
		ticketResponse.setTotalCost(fare);
		
		return ticketResponse;
	}

}
