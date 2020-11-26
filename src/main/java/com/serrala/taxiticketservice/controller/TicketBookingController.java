package com.serrala.taxiticketservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.serrala.taxiticketservice.model.BookingRequest;
import com.serrala.taxiticketservice.model.TicketResponse;
import com.serrala.taxiticketservice.service.TicketService;
/**
 * This class publishes the REST endpoint to book the ticket.
 * @author Vipin
 *
 */
@RestController
@RequestMapping("/ticket")
public class TicketBookingController {
	
	@Autowired
	TicketService ticketService;
	/**
	 * This method will accept below parameters
	 * @param bookingRequest
	 * @return TicketResponse
	 */
	@PostMapping("/book")
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	public TicketResponse bookTicket(@RequestBody BookingRequest bookingRequest) {
		TicketResponse response = ticketService.bookTicket(bookingRequest);
		return response;
	}
}
