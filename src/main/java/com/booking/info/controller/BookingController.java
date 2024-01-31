package com.booking.info.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.info.model.BookingDetails;
import com.booking.info.service.BookingInf;

@RestController
@RequestMapping("/Demo")
public class BookingController {
@Autowired
	BookingInf bookinginfo;
	
	@PostMapping("/addBooking")
	public BookingDetails addBooking(@RequestBody BookingDetails booking) {
		return bookinginfo.addBooking(booking);
			
	}
	@GetMapping("/booking")
	public List<BookingDetails> getBookingInfo(){
		return bookinginfo.bookingInf();
		
	}
	@DeleteMapping("/deleteBooking/{Id}")
	public ResponseEntity<HttpStatus>deleteBookingDetails(@PathVariable long Id){
		try {			
			
			bookinginfo.deleteBookingDetails(Id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			
			new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return null;
		
		}
	
}
