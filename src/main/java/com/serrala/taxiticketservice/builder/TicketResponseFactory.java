package com.serrala.taxiticketservice.builder;

import com.serrala.taxiticketservice.model.BookingRequest;
import com.serrala.taxiticketservice.model.TicketResponse;

public interface TicketResponseFactory<T extends TicketResponse> {
	T generateTicket(BookingRequest bookingRequest, int distance, int fare);
}
