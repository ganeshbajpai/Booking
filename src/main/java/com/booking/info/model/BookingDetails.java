package com.booking.info.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class BookingDetails {
    
	@Id
	long lr_no;
	String companyName;
	String bookingDate;
	String chargedWeight;
	String bookingLocation;
	String deliveryLocation;
	int amount_paid;
	int amount_recived;
	int gst_recived;
	long CustomerId;
	public BookingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookingDetails(long lr_no, String companyName, String bookingDate, String chargedWeight,
			String bookingLocation, String deliveryLocation, int amount_paid, int amount_recived, int gst_recived,
			long customerId) {
		super();
		this.lr_no = lr_no;
		this.companyName = companyName;
		this.bookingDate = bookingDate;
		this.chargedWeight = chargedWeight;
		this.bookingLocation = bookingLocation;
		this.deliveryLocation = deliveryLocation;
		this.amount_paid = amount_paid;
		this.amount_recived = amount_recived;
		this.gst_recived = gst_recived;
		CustomerId = customerId;
	}
	public long getLr_no() {
		return lr_no;
	}
	public void setLr_no(long lr_no) {
		this.lr_no = lr_no;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getChargedWeight() {
		return chargedWeight;
	}
	public void setChargedWeight(String chargedWeight) {
		this.chargedWeight = chargedWeight;
	}
	public String getBookingLocation() {
		return bookingLocation;
	}
	public void setBookingLocation(String bookingLocation) {
		this.bookingLocation = bookingLocation;
	}
	public String getDeliveryLocation() {
		return deliveryLocation;
	}
	public void setDeliveryLocation(String deliveryLocation) {
		this.deliveryLocation = deliveryLocation;
	}
	public int getAmount_paid() {
		return amount_paid;
	}
	public void setAmount_paid(int amount_paid) {
		this.amount_paid = amount_paid;
	}
	public int getAmount_recived() {
		return amount_recived;
	}
	public void setAmount_recived(int amount_recived) {
		this.amount_recived = amount_recived;
	}
	public int getGst_recived() {
		return gst_recived;
	}
	public void setGst_recived(int gst_recived) {
		this.gst_recived = gst_recived;
	}
	public long getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(long customerId) {
		CustomerId = customerId;
	}
	 
	
}
