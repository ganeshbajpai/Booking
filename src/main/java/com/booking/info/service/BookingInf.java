package com.booking.info.service;

import java.util.List;
import java.util.Optional;

import com.booking.info.model.BookingDetails;

public interface BookingInf {

	
	List<BookingDetails> bookingInf();
	
	public Optional<BookingDetails> getBookingDetails(long Id);
	
	public BookingDetails addBooking(BookingDetails booking);
	
	public BookingDetails updateBooking(BookingDetails booking,long Id);
	
	void deleteBookingDetails(long id);
	
}
