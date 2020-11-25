package com.serrala.taxiticketservice.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.serrala.taxiticketservice.controller.TicketBookingController;
import com.serrala.taxiticketservice.model.BookingRequest;
import com.serrala.taxiticketservice.model.TicketResponse;

@SpringBootTest
@TestPropertySource("classpath:application-test.properties")
public class TicketBookingControllerTests {
	
	@Autowired
	TicketBookingController ticketBookingController;
	
	@Test
	public void bookTicketForSingleTraveller() {
		BookingRequest bookingRequest = new BookingRequest("PUNE", "MUMBAI", 2);
		TicketResponse response = ticketBookingController.bookTicket(bookingRequest);
		assertThat(response).isEqualTo(buildResponse(bookingRequest));
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
