package com.spring.service;

import java.util.List;

import com.spring.exception.ReservationNotAvailableException;
import com.spring.model.Reservation;
import com.spring.model.SportType;

public interface ReservationService {

	public List<Reservation> query(String courtName);
	public void make(Reservation reservation) throws ReservationNotAvailableException;
	public List<SportType> getAllSportTypes();
	public SportType getSportType(int sportTypeId);
	
}
