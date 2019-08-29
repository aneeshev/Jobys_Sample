package com.spring.converter;

import org.springframework.core.convert.converter.Converter;

import com.spring.model.SportType;
import com.spring.service.ReservationService;

public class SportTypeConverter implements Converter<String, SportType> {

	private ReservationService reservationService;
	
	public SportTypeConverter(ReservationService reservationService) {
		this.reservationService = reservationService;
	}

	@Override
	public SportType convert(String source) {
		int sportTypeId = Integer.parseInt(source);
		return reservationService.getSportType(sportTypeId);
	}

}
