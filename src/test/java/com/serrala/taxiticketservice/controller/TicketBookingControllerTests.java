package com.serrala.taxiticketservice.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.serrala.taxiticketservice.controller.TicketBookingController;
import com.serrala.taxiticketservice.exception.RouteNotFoundException;
import com.serrala.taxiticketservice.model.BookingRequest;
import com.serrala.taxiticketservice.model.TicketResponse;

@SpringBootTest
@TestPropertySource("classpath:application-test.properties")
public class TicketBookingControllerTests {
	
	@Autowired
	TicketBookingController ticketBookingController;
	
	@Test
	public void bookTicketForSingleTraveller_WithDistanve() {
		BookingRequest bookingRequest = new BookingRequest("PUNE", "MUMBAI", 1);
		TicketResponse response = ticketBookingController.bookTicket(bookingRequest);
		assertThat(response.getDestination()).isEqualTo(buildResponse(bookingRequest).getDestination());
	}
	
	@Test
	public void bookTicketForSingleTraveller_WithFare() {
		BookingRequest bookingRequest = new BookingRequest("PUNE", "MUMBAI", 1);
		TicketResponse response = ticketBookingController.bookTicket(bookingRequest);
		assertThat(response.getTotalCost()).isEqualTo(buildResponse(bookingRequest).getTotalCost());
	}
	
	@Test
	public void bookTicketForMultiTraveller_WithFare() {
		BookingRequest bookingRequest = new BookingRequest("PUNE", "MUMBAI", 3);
		TicketResponse response = ticketBookingController.bookTicket(bookingRequest);
		assertThat(response.getTotalCost()).isEqualTo(buildResponse(bookingRequest).getTotalCost());
	}
	
	@Test
	public void bookTicketForSingleTraveller_WithRouteDoesNotExist() {
		BookingRequest bookingRequest = new BookingRequest("PUNE", "DELHI", 1);
		ticketBookingController.bookTicket(bookingRequest);
	}
	
	@Test
	public void bookTicketForSingleTraveller_printTicket() {
		BookingRequest bookingRequest = new BookingRequest("PUNE", "NASIK", 2);
		TicketResponse response = ticketBookingController.bookTicket(bookingRequest);
		StringBuilder builder = new StringBuilder("Taxi Ticket\n");
		builder.append("----------\n");
		builder.append("Source: "+response.getSource());
		builder.append("\nDestination: "+response.getDestination());
		builder.append("\nKms: "+response.getDistance());
		builder.append("\nNo. Of Travellers: "+response.getNoOfTravellers());
		builder.append("\nTotal Fare: "+response.getTotalCost());
		
		System.out.println(builder.toString());
	}
	
	public TicketResponse buildResponse(BookingRequest bookingRequest) {
		int taxiFare = 0;
		if(bookingRequest.getSource().equals("PUNE")
				&& bookingRequest.getDestination().equals("MUMBAI")) 
			taxiFare = 850;
		
		TicketResponse ticketResponse = new TicketResponse();
		ticketResponse.setSource(bookingRequest.getSource());
		ticketResponse.setDestination(bookingRequest.getDestination());
		ticketResponse.setNoOfTravellers(bookingRequest.getNoOfTravellers());
		ticketResponse.setTotalCost(bookingRequest.getNoOfTravellers()*taxiFare);
		
		return ticketResponse;
	}
	
}
