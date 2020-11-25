package com.serrala.taxiticketservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serrala.taxiticketservice.model.BookingRequest;
import com.serrala.taxiticketservice.model.TicketResponse;

@RestController
@RequestMapping("/ticket")
public class TicketBookingController {
	
	@PostMapping("/book")
	public TicketResponse bookTicket(@RequestBody BookingRequest bookingRequest) {
		TicketResponse response = null;
		return response;
	}
}
