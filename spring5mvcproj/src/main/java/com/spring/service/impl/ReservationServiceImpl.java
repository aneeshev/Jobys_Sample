package com.spring.service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.spring.exception.ReservationNotAvailableException;
import com.spring.model.Player;
import com.spring.model.Reservation;
import com.spring.model.SportType;
import com.spring.service.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	public static final SportType TENNIS = new SportType(1, "Tennis");
	public static final SportType SOCCER = new SportType(2, "Soccer");
	
	private final List<Reservation> reservations = new ArrayList<>();
	
	public ReservationServiceImpl() {
		reservations.add(new Reservation("Tennis #1", LocalDate.of(2008, 1, 14), 16,
				new Player("Roger", "N/A"), TENNIS));
		reservations.add(new Reservation("Tennis #2", LocalDate.of(2008, 1, 14), 20,
				new Player("James", "N/A"), TENNIS));
	}

	@Override
	public List<Reservation> query(String courtName) {
		return this.reservations.stream()
				.filter(reservation -> Objects.equals(reservation.getCourtName(), courtName))
				.collect(Collectors.toList());
	}
	
	@Override
	public void make(Reservation reservation) throws ReservationNotAvailableException {
		long cnt = reservations.stream()
		.filter(made -> Objects.equals(made.getCourtName(), reservation.getCourtName()))
		.filter(made -> Objects.equals(made.getDate(), reservation.getDate()))
		.filter(made -> made.getHour() == reservation.getHour())
		.count();
	
		if (cnt > 0) {
			throw new ReservationNotAvailableException(reservation
			.getCourtName(), reservation.getDate(), reservation
			.getHour());
		} else {
			reservations.add(reservation);
		}
	}

	@Override
	public List<SportType> getAllSportTypes() {
		return Arrays.asList(TENNIS,SOCCER);
	}

	@Override
	public SportType getSportType(int sportTypeId) {
		switch (sportTypeId) {
			case 1:
				return TENNIS;
			case 2:
				return SOCCER;
			default:
				return null;
		}
	}

}
