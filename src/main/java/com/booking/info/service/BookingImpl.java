package com.booking.info.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.info.dao.BookingDao;
import com.booking.info.model.BookingDetails;


@Service
public class BookingImpl implements BookingInf {
	
	@Autowired
	private BookingDao bookingDao;

	@Override
	public List<BookingDetails> bookingInf() {
		
		return bookingDao.findAll();
	}

	@Override
	public Optional<BookingDetails> getBookingDetails(long Id) {
		Optional<BookingDetails>entity2=bookingDao.findById(Id);
		return entity2;
		
	}

	@Override
	public BookingDetails addBooking(BookingDetails booking) {
		bookingDao.save(booking);
		return booking;
	}

	@Override
	public BookingDetails updateBooking(BookingDetails booking, long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public void deleteBookingDetails(long Id) {
		
		BookingDetails entity= bookingDao.getReferenceById(Id);
		bookingDao.delete(entity);
		
	}

}
