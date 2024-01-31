package com.booking.info.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booking.info.model.BookingDetails;

public interface BookingDao extends JpaRepository<BookingDetails, Long>{

}
