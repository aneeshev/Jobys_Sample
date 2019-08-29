package com.spring.exception;

import java.time.LocalDate;

public class ReservationNotAvailableException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String courtName;
	private LocalDate date;
	private int hour;
	
	public ReservationNotAvailableException(String courtName, LocalDate date, int hour) {
		this.courtName = courtName;
		this.date = date;
		this.hour = hour;
	}

	public String getCourtName() {
		return courtName;
	}

	public LocalDate getDate() {
		return date;
	}

	public int getHour() {
		return hour;
	}
	
}
